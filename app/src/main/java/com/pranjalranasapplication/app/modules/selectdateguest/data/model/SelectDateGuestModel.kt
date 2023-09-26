package com.pranjalranasapplication.app.modules.selectdateguest.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SelectDateGuestModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectdate: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckin: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDecCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_dec_16)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckout: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDecCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_dec_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGuest: String? = MyApp.getInstance().resources.getString(R.string.lbl_guest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_435)

)
