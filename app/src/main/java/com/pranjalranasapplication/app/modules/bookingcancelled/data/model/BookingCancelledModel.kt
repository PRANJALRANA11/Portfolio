package com.pranjalranasapplication.app.modules.bookingcancelled.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookingCancelledModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalepresident: String? =
      MyApp.getInstance().resources.getString(R.string.msg_palms_casino_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParisfrance: String? = MyApp.getInstance().resources.getString(R.string.msg_london_united)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThemarkhotel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_mark_hotel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_luxemburg_germ)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etStatuserrorcompValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatuserrorcompOneValue: String? = null
)
