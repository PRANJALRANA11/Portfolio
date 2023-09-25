package com.pranjalranasapplication.app.modules.resetpasswordsuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.resetpasswordsuccessful.`data`.model.ResetPasswordSuccessfulModel
import org.koin.core.KoinComponent

class ResetPasswordSuccessfulVM : ViewModel(), KoinComponent {
  val resetPasswordSuccessfulModel: MutableLiveData<ResetPasswordSuccessfulModel> =
      MutableLiveData(ResetPasswordSuccessfulModel())

  var navArguments: Bundle? = null
}
