package com.pranjalranasapplication.app.modules.bookingcompleted.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookingCompletedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalepresident: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bulgari_resort)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_paris_france)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalepresidentOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hotel_martinez)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryOne: String? = MyApp.getInstance().resources.getString(R.string.msg_amsterdam_neth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etStatussuccessValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatussuccessOneValue: String? = null
)
