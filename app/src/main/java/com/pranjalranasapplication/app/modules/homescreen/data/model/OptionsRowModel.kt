package com.pranjalranasapplication.app.modules.homescreen.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OptionsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSizemediumtypef: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recommended)

)
