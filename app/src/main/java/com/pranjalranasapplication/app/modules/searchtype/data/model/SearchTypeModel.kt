package com.pranjalranasapplication.app.modules.searchtype.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchTypeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecent: String? = MyApp.getInstance().resources.getString(R.string.lbl_recent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPalazzohotel: String? = MyApp.getInstance().resources.getString(R.string.lbl_palazzo_hotel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBulgarihotel: String? = MyApp.getInstance().resources.getString(R.string.lbl_bulgari_hotel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_amsterdam_neth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMartinezcannes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_martinez_cannes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLondonunitedkinOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_london_united)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPalmscasinohoteOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_palms_casino_ho)

)
