package com.pranjalranasapplication.app.modules.welcomescreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.welcomescreen.`data`.model.WelcomeScreenModel
import org.koin.core.KoinComponent

class WelcomeScreenVM : ViewModel(), KoinComponent {
  val welcomeScreenModel: MutableLiveData<WelcomeScreenModel> =
      MutableLiveData(WelcomeScreenModel())

  var navArguments: Bundle? = null
}
