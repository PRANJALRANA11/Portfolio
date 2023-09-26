package com.pranjalranasapplication.app.modules.paymentsuccessful.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtModaltitle: String? = MyApp.getInstance().resources.getString(R.string.msg_payment_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_successfully_ma)

)
