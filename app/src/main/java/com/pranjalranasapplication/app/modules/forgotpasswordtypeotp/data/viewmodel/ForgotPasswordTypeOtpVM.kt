package com.pranjalranasapplication.app.modules.forgotpasswordtypeotp.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.forgotpasswordtypeotp.`data`.model.ForgotPasswordTypeOtpModel
import org.koin.core.KoinComponent

class ForgotPasswordTypeOtpVM : ViewModel(), KoinComponent {
  val forgotPasswordTypeOtpModel: MutableLiveData<ForgotPasswordTypeOtpModel> =
      MutableLiveData(ForgotPasswordTypeOtpModel())

  var navArguments: Bundle? = null
}
