package com.pranjalranasapplication.app.modules.filterresult.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.filterresult.`data`.model.FilterResultModel
import com.pranjalranasapplication.app.modules.filterresult.`data`.model.Listrectanglefour3RowModel
import com.pranjalranasapplication.app.modules.filterresult.`data`.model.Listsizemediumtypef3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FilterResultVM : ViewModel(), KoinComponent {
  val filterResultModel: MutableLiveData<FilterResultModel> = MutableLiveData(FilterResultModel())

  var navArguments: Bundle? = null

  val listsizemediumtypefList: MutableLiveData<MutableList<Listsizemediumtypef3RowModel>> =
      MutableLiveData(mutableListOf())

  val listrectanglefourList: MutableLiveData<MutableList<Listrectanglefour3RowModel>> =
      MutableLiveData(mutableListOf())
}
