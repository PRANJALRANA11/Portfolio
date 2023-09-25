package com.pranjalranasapplication.app.modules.forgotpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityForgotPasswordBinding
import com.pranjalranasapplication.app.modules.forgotpassword.`data`.model.ListvolumeRowModel
import com.pranjalranasapplication.app.modules.forgotpassword.`data`.viewmodel.ForgotPasswordVM
import com.pranjalranasapplication.app.modules.forgotpasswordtypeotp.ui.ForgotPasswordTypeOtpActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ForgotPasswordActivity :
    BaseActivity<ActivityForgotPasswordBinding>(R.layout.activity_forgot_password) {
  private val viewModel: ForgotPasswordVM by viewModels<ForgotPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listvolumeAdapter = ListvolumeAdapter(viewModel.listvolumeList.value?:mutableListOf())
    binding.recyclerListvolume.adapter = listvolumeAdapter
    listvolumeAdapter.setOnItemClickListener(
    object : ListvolumeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListvolumeRowModel) {
        onClickRecyclerListvolume(view, position, item)
      }
    }
    )
    viewModel.listvolumeList.observe(this) {
      listvolumeAdapter.updateData(it)
    }
    binding.forgotPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = ForgotPasswordTypeOtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListvolume(
    view: View,
    position: Int,
    item: ListvolumeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FORGOT_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
