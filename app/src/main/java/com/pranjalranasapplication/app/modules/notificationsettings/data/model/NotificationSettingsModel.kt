package com.pranjalranasapplication.app.modules.notificationsettings.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationSettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGeneralnotificaOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_general_notific)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSound: String? = MyApp.getInstance().resources.getString(R.string.lbl_sound)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVibrate: String? = MyApp.getInstance().resources.getString(R.string.lbl_vibrate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppupdates: String? = MyApp.getInstance().resources.getString(R.string.lbl_app_updates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewserviceavailOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_new_service_ava)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewtipsavailablOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_new_tips_availa)

)
