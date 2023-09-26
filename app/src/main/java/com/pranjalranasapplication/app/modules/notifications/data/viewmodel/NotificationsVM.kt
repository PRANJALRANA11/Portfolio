package com.pranjalranasapplication.app.modules.notifications.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.notifications.`data`.model.Listclock1RowModel
import com.pranjalranasapplication.app.modules.notifications.`data`.model.ListclockRowModel
import com.pranjalranasapplication.app.modules.notifications.`data`.model.NotificationsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationsVM : ViewModel(), KoinComponent {
  val notificationsModel: MutableLiveData<NotificationsModel> =
      MutableLiveData(NotificationsModel())

  var navArguments: Bundle? = null

  val listclockList: MutableLiveData<MutableList<ListclockRowModel>> =
      MutableLiveData(mutableListOf())

  val listclock1List: MutableLiveData<MutableList<Listclock1RowModel>> =
      MutableLiveData(mutableListOf())
}
