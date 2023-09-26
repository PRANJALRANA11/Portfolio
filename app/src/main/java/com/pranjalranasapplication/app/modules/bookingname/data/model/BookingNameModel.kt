package com.pranjalranasapplication.app.modules.bookingname.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookingNameModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNameofreservatiOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_of_reserva)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizemediumtypef: String? = MyApp.getInstance().resources.getString(R.string.lbl_mr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizemediumtypeb: String? = MyApp.getInstance().resources.getString(R.string.lbl_mrs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizemediumtypebOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_ms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusfilltypedValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFirstnameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDobValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPhoneValue: String? = null
)
