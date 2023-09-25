package com.pranjalranasapplication.app.modules.viewticket.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ViewTicketModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTicket: String? = MyApp.getInstance().resources.getString(R.string.lbl_ticket)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalepresidentOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_royale_presiden)

)
