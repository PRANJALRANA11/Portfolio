package com.pranjalranasapplication.app.modules.bookingongoing.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectangleRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalepresidentOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_royale_presiden)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_paris_france)

)
