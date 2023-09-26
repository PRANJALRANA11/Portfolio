package com.pranjalranasapplication.app.modules.letsyouin.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LetSYouInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsyouin: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_you_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)

)
