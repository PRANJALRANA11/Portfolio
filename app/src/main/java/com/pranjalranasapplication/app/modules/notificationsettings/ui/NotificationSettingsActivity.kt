package com.pranjalranasapplication.app.modules.notificationsettings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityNotificationSettingsBinding
import com.pranjalranasapplication.app.modules.notificationsettings.`data`.viewmodel.NotificationSettingsVM
import kotlin.String
import kotlin.Unit

class NotificationSettingsActivity :
    BaseActivity<ActivityNotificationSettingsBinding>(R.layout.activity_notification_settings) {
  private val viewModel: NotificationSettingsVM by viewModels<NotificationSettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationSettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_SETTINGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationSettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
