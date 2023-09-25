package com.pranjalranasapplication.app.modules.bookingcancelled.ui

import androidx.fragment.app.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseFragment
import com.pranjalranasapplication.app.databinding.FragmentBookingCancelledBinding
import com.pranjalranasapplication.app.modules.bookingcancelled.`data`.viewmodel.BookingCancelledVM
import kotlin.String
import kotlin.Unit

class BookingCancelledFragment :
    BaseFragment<FragmentBookingCancelledBinding>(R.layout.fragment_booking_cancelled) {
  private val viewModel: BookingCancelledVM by viewModels<BookingCancelledVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.bookingCancelledVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BOOKING_CANCELLED_FRAGMENT"

  }
}
