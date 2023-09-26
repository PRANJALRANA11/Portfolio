package com.pranjalranasapplication.app.modules.bookmarkremoval.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.bookmarkremoval.`data`.model.BookmarkRemovalModel
import org.koin.core.KoinComponent

class BookmarkRemovalVM : ViewModel(), KoinComponent {
  val bookmarkRemovalModel: MutableLiveData<BookmarkRemovalModel> =
      MutableLiveData(BookmarkRemovalModel())

  var navArguments: Bundle? = null
}
