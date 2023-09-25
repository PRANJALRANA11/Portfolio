package com.pranjalranasapplication.app.modules.notificationsettings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.notificationsettings.`data`.model.NotificationSettingsModel
import org.koin.core.KoinComponent

class NotificationSettingsVM : ViewModel(), KoinComponent {
  val notificationSettingsModel: MutableLiveData<NotificationSettingsModel> =
      MutableLiveData(NotificationSettingsModel())

  var navArguments: Bundle? = null
}
