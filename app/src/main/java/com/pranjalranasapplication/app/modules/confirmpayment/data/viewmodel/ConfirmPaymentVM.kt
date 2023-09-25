package com.pranjalranasapplication.app.modules.confirmpayment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.confirmpayment.`data`.model.ConfirmPaymentModel
import com.pranjalranasapplication.app.modules.confirmpayment.`data`.model.ListcheckinRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ConfirmPaymentVM : ViewModel(), KoinComponent {
  val confirmPaymentModel: MutableLiveData<ConfirmPaymentModel> =
      MutableLiveData(ConfirmPaymentModel())

  var navArguments: Bundle? = null

  val listcheckinList: MutableLiveData<MutableList<ListcheckinRowModel>> =
      MutableLiveData(mutableListOf())
}
