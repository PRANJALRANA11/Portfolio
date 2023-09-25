package com.pranjalranasapplication.app.modules.cancelbooking.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.pranjalranasapplication.app.databinding.BottomsheetCancelBookingBinding
import com.pranjalranasapplication.app.modules.cancelbooking.`data`.viewmodel.CancelBookingVM
import com.pranjalranasapplication.app.modules.refundmethod.ui.RefundMethodActivity
import kotlin.String
import kotlin.Unit

class CancelBookingBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetCancelBookingBinding>(R.layout.bottomsheet_cancel_booking)
    {
  private val viewModel: CancelBookingVM by viewModels<CancelBookingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.cancelBookingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = RefundMethodActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "CANCEL_BOOKING_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): CancelBookingBottomsheet {
      val fragment = CancelBookingBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
