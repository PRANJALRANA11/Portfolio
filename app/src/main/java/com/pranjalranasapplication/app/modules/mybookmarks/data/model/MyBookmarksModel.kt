package com.pranjalranasapplication.app.modules.mybookmarks.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyBookmarksModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMybookmarks: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_bookmarks)

)
