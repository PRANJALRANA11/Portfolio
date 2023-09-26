package com.pranjalranasapplication.app.modules.searchtype.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.searchtype.`data`.model.Listsizemediumtypef1RowModel
import com.pranjalranasapplication.app.modules.searchtype.`data`.model.SearchTypeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchTypeVM : ViewModel(), KoinComponent {
  val searchTypeModel: MutableLiveData<SearchTypeModel> = MutableLiveData(SearchTypeModel())

  var navArguments: Bundle? = null

  val listsizemediumtypefList: MutableLiveData<MutableList<Listsizemediumtypef1RowModel>> =
      MutableLiveData(mutableListOf())
}
