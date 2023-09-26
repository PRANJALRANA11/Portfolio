package com.pranjalranasapplication.app.modules.searchfilter.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchFilterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilterhotel: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter_hotel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_country)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSortresults: String? = MyApp.getInstance().resources.getString(R.string.lbl_sort_results)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPricerangeper: String? =
      MyApp.getInstance().resources.getString(R.string.msg_price_range_per)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_182)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStarrating: String? = MyApp.getInstance().resources.getString(R.string.lbl_star_rating)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFacilities: String? = MyApp.getInstance().resources.getString(R.string.lbl_facilities)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeallOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccommodationtyOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_accommodation_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeallTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
