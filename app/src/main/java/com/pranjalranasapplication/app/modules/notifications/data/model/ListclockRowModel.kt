package com.pranjalranasapplication.app.modules.notifications.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListclockRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentsuccessfOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_payment_success2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLalunahotelbookOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laluna_hotel_bo)

)
