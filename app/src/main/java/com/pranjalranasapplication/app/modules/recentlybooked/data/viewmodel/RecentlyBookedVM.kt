package com.pranjalranasapplication.app.modules.recentlybooked.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.recentlybooked.`data`.model.Listrectanglefour2RowModel
import com.pranjalranasapplication.app.modules.recentlybooked.`data`.model.RecentlyBookedModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RecentlyBookedVM : ViewModel(), KoinComponent {
  val recentlyBookedModel: MutableLiveData<RecentlyBookedModel> =
      MutableLiveData(RecentlyBookedModel())

  var navArguments: Bundle? = null

  val listrectanglefourList: MutableLiveData<MutableList<Listrectanglefour2RowModel>> =
      MutableLiveData(mutableListOf())
}
