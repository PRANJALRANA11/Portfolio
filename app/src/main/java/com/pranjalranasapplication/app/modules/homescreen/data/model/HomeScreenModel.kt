package com.pranjalranasapplication.app.modules.homescreen.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtComfort: String? = MyApp.getInstance().resources.getString(R.string.lbl_comfort)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHellodaniel: String? = MyApp.getInstance().resources.getString(R.string.msg_hello_daniel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentlybooked: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recently_booked)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
