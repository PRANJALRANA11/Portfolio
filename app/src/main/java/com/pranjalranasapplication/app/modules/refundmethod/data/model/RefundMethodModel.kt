package com.pranjalranasapplication.app.modules.refundmethod.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RefundMethodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCancelhotelbookOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cancel_hotel_bo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseselecta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_select_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_paid_479_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_refund_383_8)

)
