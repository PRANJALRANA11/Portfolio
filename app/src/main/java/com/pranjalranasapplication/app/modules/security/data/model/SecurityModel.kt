package com.pranjalranasapplication.app.modules.security.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SecurityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSecurity: String? = MyApp.getInstance().resources.getString(R.string.lbl_security)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFaceid: String? = MyApp.getInstance().resources.getString(R.string.lbl_face_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRememberme: String? = MyApp.getInstance().resources.getString(R.string.lbl_remember_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTouchid: String? = MyApp.getInstance().resources.getString(R.string.lbl_touch_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoogleauthenticOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_google_authenti)

)
