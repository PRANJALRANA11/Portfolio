package com.pranjalranasapplication.app.modules.searchpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.searchpage.`data`.model.Listrectanglefour1RowModel
import com.pranjalranasapplication.app.modules.searchpage.`data`.model.ListsizemediumtypefRowModel
import com.pranjalranasapplication.app.modules.searchpage.`data`.model.SearchPageModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchPageVM : ViewModel(), KoinComponent {
  val searchPageModel: MutableLiveData<SearchPageModel> = MutableLiveData(SearchPageModel())

  var navArguments: Bundle? = null

  val listsizemediumtypefList: MutableLiveData<MutableList<ListsizemediumtypefRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectanglefourList: MutableLiveData<MutableList<Listrectanglefour1RowModel>> =
      MutableLiveData(mutableListOf())
}
