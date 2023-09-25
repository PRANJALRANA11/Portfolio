package com.pranjalranasapplication.app.modules.profilesettings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.profilesettings.`data`.model.ProfileSettingsModel
import org.koin.core.KoinComponent

class ProfileSettingsVM : ViewModel(), KoinComponent {
  val profileSettingsModel: MutableLiveData<ProfileSettingsModel> =
      MutableLiveData(ProfileSettingsModel())

  var navArguments: Bundle? = null
}
