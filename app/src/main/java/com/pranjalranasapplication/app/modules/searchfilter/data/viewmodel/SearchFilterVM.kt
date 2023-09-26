package com.pranjalranasapplication.app.modules.searchfilter.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.searchfilter.`data`.model.ListcountryRowModel
import com.pranjalranasapplication.app.modules.searchfilter.`data`.model.Listsizemediumtypef2RowModel
import com.pranjalranasapplication.app.modules.searchfilter.`data`.model.ListstarRowModel
import com.pranjalranasapplication.app.modules.searchfilter.`data`.model.SearchFilterModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchFilterVM : ViewModel(), KoinComponent {
  val searchFilterModel: MutableLiveData<SearchFilterModel> = MutableLiveData(SearchFilterModel())

  var navArguments: Bundle? = null

  val listcountryList: MutableLiveData<MutableList<ListcountryRowModel>> =
      MutableLiveData(mutableListOf())

  val listsizemediumtypefList: MutableLiveData<MutableList<Listsizemediumtypef2RowModel>> =
      MutableLiveData(mutableListOf())

  val liststarList: MutableLiveData<MutableList<ListstarRowModel>> =
      MutableLiveData(mutableListOf())
}
