package com.pranjalranasapplication.app.modules.viewticket.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TicketRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDanielaustin: String? = MyApp.getInstance().resources.getString(R.string.lbl_daniel_austin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhonenumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1123456789000: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_123_456_789_000)

)
