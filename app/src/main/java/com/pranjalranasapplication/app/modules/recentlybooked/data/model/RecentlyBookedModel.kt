package com.pranjalranasapplication.app.modules.recentlybooked.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RecentlyBookedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentlybooked: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recently_booked)

)
