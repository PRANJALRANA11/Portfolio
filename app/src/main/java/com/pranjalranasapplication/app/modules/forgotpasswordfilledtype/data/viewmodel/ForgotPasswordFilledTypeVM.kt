package com.pranjalranasapplication.app.modules.forgotpasswordfilledtype.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.forgotpasswordfilledtype.`data`.model.ForgotPasswordFilledTypeModel
import org.koin.core.KoinComponent

class ForgotPasswordFilledTypeVM : ViewModel(), KoinComponent {
  val forgotPasswordFilledTypeModel: MutableLiveData<ForgotPasswordFilledTypeModel> =
      MutableLiveData(ForgotPasswordFilledTypeModel())

  var navArguments: Bundle? = null
}
