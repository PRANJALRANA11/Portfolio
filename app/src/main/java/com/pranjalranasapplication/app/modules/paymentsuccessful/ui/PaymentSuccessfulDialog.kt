package com.pranjalranasapplication.app.modules.paymentsuccessful.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseDialogFragment
import com.pranjalranasapplication.app.databinding.DialogPaymentSuccessfulBinding
import com.pranjalranasapplication.app.modules.paymentsuccessful.`data`.viewmodel.PaymentSuccessfulVM
import com.pranjalranasapplication.app.modules.viewticket.ui.ViewTicketActivity
import kotlin.String
import kotlin.Unit

class PaymentSuccessfulDialog :
    BaseDialogFragment<DialogPaymentSuccessfulBinding>(R.layout.dialog_payment_successful) {
  private val viewModel: PaymentSuccessfulVM by viewModels<PaymentSuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.paymentSuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnViewTicket.setOnClickListener {
      val destIntent = ViewTicketActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "PAYMENT_SUCCESSFUL_DIALOG"


    fun getInstance(bundle: Bundle?): PaymentSuccessfulDialog {
      val fragment = PaymentSuccessfulDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
