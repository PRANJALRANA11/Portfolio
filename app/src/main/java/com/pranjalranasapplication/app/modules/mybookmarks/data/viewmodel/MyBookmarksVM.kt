package com.pranjalranasapplication.app.modules.mybookmarks.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.mybookmarks.`data`.model.BookmarksRowModel
import com.pranjalranasapplication.app.modules.mybookmarks.`data`.model.MyBookmarksModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MyBookmarksVM : ViewModel(), KoinComponent {
  val myBookmarksModel: MutableLiveData<MyBookmarksModel> = MutableLiveData(MyBookmarksModel())

  var navArguments: Bundle? = null

  val myBookmarksList: MutableLiveData<MutableList<BookmarksRowModel>> =
      MutableLiveData(mutableListOf())
}
