package com.pranjalranasapplication.app.modules.refundmethod.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MethodRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaypal: String? = MyApp.getInstance().resources.getString(R.string.lbl_paypal)

)
