package com.pranjalranasapplication.app.modules.selectdateguest.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.selectdateguest.`data`.model.SelectDateGuestModel
import org.koin.core.KoinComponent

class SelectDateGuestVM : ViewModel(), KoinComponent {
  val selectDateGuestModel: MutableLiveData<SelectDateGuestModel> =
      MutableLiveData(SelectDateGuestModel())

  var navArguments: Bundle? = null
}
