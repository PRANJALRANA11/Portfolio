package com.pranjalranasapplication.app.modules.refundmethod.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.refundmethod.`data`.model.MethodRowModel
import com.pranjalranasapplication.app.modules.refundmethod.`data`.model.RefundMethodModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RefundMethodVM : ViewModel(), KoinComponent {
  val refundMethodModel: MutableLiveData<RefundMethodModel> = MutableLiveData(RefundMethodModel())

  var navArguments: Bundle? = null

  val refundMethodList: MutableLiveData<MutableList<MethodRowModel>> =
      MutableLiveData(mutableListOf())
}
