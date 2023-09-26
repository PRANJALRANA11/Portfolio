package com.pranjalranasapplication.app.modules.signupblank.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.appcomponents.facebookauth.FacebookHelper
import com.pranjalranasapplication.app.appcomponents.googleauth.GoogleHelper
import com.pranjalranasapplication.app.databinding.ActivitySignUpBlankBinding
import com.pranjalranasapplication.app.modules.fillprofile.ui.FillProfileActivity
import com.pranjalranasapplication.app.modules.signupblank.`data`.viewmodel.SignUpBlankVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpBlankActivity :
    BaseActivity<ActivitySignUpBlankBinding>(R.layout.activity_sign_up_blank) {
  private val viewModel: SignUpBlankVM by viewModels<SignUpBlankVM>()

  private lateinit var googleLogin: GoogleHelper

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()


  private val facebookLogin: FacebookHelper = FacebookHelper()


  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ): Unit {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpBlankVM = viewModel
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
        binding.imageArrowleft.setOnClickListener {
          finish()
        }
        binding.imageGoogle.setOnClickListener {
          googleLogin.login()
        }
        binding.btnSignUp.setOnClickListener {
          val destIntent = FillProfileActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }

      companion object {
        const val TAG: String = "SIGN_UP_BLANK_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, SignUpBlankActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
