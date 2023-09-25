package com.pranjalranasapplication.app.modules.signin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.material.snackbar.Snackbar
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import com.pranjalranasapplication.app.appcomponents.facebookauth.FacebookHelper
import com.pranjalranasapplication.app.appcomponents.googleauth.GoogleHelper
import com.pranjalranasapplication.app.databinding.ActivitySignInBinding
import com.pranjalranasapplication.app.extensions.NoInternetConnection
import com.pranjalranasapplication.app.extensions.isJSONObject
import com.pranjalranasapplication.app.extensions.showProgressDialog
import com.pranjalranasapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.pranjalranasapplication.app.modules.homescreencontainer.ui.HomeScreenContainerActivity
import com.pranjalranasapplication.app.modules.signin.`data`.viewmodel.SignInVM
import com.pranjalranasapplication.app.modules.signupblank.ui.SignUpBlankActivity
import com.pranjalranasapplication.app.network.models.createlogin.CreateLoginResponse
import com.pranjalranasapplication.app.network.resources.ErrorResponse
import com.pranjalranasapplication.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class SignInActivity : BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
  private val viewModel: SignInVM by viewModels<SignInVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  private lateinit var googleLogin: GoogleHelper

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.imageFacebook.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.imageGoogle.setOnClickListener {
          googleLogin.login()
        }
        binding.txtSignup.setOnClickListener {
          val destIntent = SignUpBlankActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        binding.imageArrowleft.setOnClickListener {
          finish()
        }
        binding.txtForgotthepasswoOne.setOnClickListener {
          val destIntent = ForgotPasswordActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }

      override fun addObservers() {
        var progressDialog : AlertDialog? = null
        viewModel.progressLiveData.observe(this@SignInActivity) {
          if(it) {
            progressDialog?.dismiss()
            progressDialog = null
            progressDialog = this@SignInActivity.showProgressDialog()
          } else  {
            progressDialog?.dismiss()
          }
        }
        viewModel.createLoginLiveData.observe(this@SignInActivity) {
          if(it is SuccessResponse) {
            val response = it.getContentIfNotHandled()
            onSuccessCreateLogin(it)
          } else if(it is ErrorResponse)  {
            onErrorCreateLogin(it.data ?:Exception())
          }
        }
      }

      private fun onSuccessCreateLogin(response: SuccessResponse<CreateLoginResponse>) {
        viewModel.bindCreateLoginResponse(response.data)
        val destIntent = HomeScreenContainerActivity.getIntent(this, null)
        destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(destIntent)
      }

      private fun onErrorCreateLogin(exception: Exception) {
        when(exception) {
          is NoInternetConnection -> {
            Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
          }
          is HttpException -> {
            val errorBody = exception.response()?.errorBody()?.string()
            val errorObject = if (errorBody != null  && errorBody.isJSONObject())
                JSONObject(errorBody) else JSONObject()
            Toast.makeText(this@SignInActivity,MyApp.getInstance().getString(R.string.msg_invalid_username_or_pa),Toast.LENGTH_LONG).show()
          }
        }
      }

      companion object {
        const val TAG: String = "SIGN_IN_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, SignInActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
