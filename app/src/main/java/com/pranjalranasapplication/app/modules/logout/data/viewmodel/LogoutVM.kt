package com.pranjalranasapplication.app.modules.logout.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.logout.`data`.model.LogoutModel
import org.koin.core.KoinComponent

class LogoutVM : ViewModel(), KoinComponent {
  val logoutModel: MutableLiveData<LogoutModel> = MutableLiveData(LogoutModel())

  var navArguments: Bundle? = null
}
