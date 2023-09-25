package com.pranjalranasapplication.app.modules.paymentsuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.paymentsuccessful.`data`.model.PaymentSuccessfulModel
import org.koin.core.KoinComponent

class PaymentSuccessfulVM : ViewModel(), KoinComponent {
  val paymentSuccessfulModel: MutableLiveData<PaymentSuccessfulModel> =
      MutableLiveData(PaymentSuccessfulModel())

  var navArguments: Bundle? = null
}
