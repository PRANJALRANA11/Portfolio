package com.pranjalranasapplication.app.modules.searchpage.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommended5863One: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_58)

)
