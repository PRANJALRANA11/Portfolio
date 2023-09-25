package com.pranjalranasapplication.app.modules.cancelationsuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.cancelationsuccessful.`data`.model.CancelationSuccessfulModel
import org.koin.core.KoinComponent

class CancelationSuccessfulVM : ViewModel(), KoinComponent {
  val cancelationSuccessfulModel: MutableLiveData<CancelationSuccessfulModel> =
      MutableLiveData(CancelationSuccessfulModel())

  var navArguments: Bundle? = null
}
