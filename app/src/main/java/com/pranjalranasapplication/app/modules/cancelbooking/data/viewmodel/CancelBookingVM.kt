package com.pranjalranasapplication.app.modules.cancelbooking.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.cancelbooking.`data`.model.CancelBookingModel
import org.koin.core.KoinComponent

class CancelBookingVM : ViewModel(), KoinComponent {
  val cancelBookingModel: MutableLiveData<CancelBookingModel> =
      MutableLiveData(CancelBookingModel())

  var navArguments: Bundle? = null
}
