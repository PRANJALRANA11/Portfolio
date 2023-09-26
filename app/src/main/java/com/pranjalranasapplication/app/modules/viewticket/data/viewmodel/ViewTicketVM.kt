package com.pranjalranasapplication.app.modules.viewticket.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.viewticket.`data`.model.TicketRowModel
import com.pranjalranasapplication.app.modules.viewticket.`data`.model.ViewTicketModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ViewTicketVM : ViewModel(), KoinComponent {
  val viewTicketModel: MutableLiveData<ViewTicketModel> = MutableLiveData(ViewTicketModel())

  var navArguments: Bundle? = null

  val viewTicketList: MutableLiveData<MutableList<TicketRowModel>> =
      MutableLiveData(mutableListOf())
}
