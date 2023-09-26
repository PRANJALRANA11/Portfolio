package com.pranjalranasapplication.app.modules.security.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.security.`data`.model.SecurityModel
import org.koin.core.KoinComponent

class SecurityVM : ViewModel(), KoinComponent {
  val securityModel: MutableLiveData<SecurityModel> = MutableLiveData(SecurityModel())

  var navArguments: Bundle? = null
}
