package com.pranjalranasapplication.app.modules.resetpasswordsuccessful.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ResetPasswordSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtModaltitle: String? = MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_account_is)

)
