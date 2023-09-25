package com.pranjalranasapplication.app.modules.bookingcompleted.ui

import androidx.fragment.app.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseFragment
import com.pranjalranasapplication.app.databinding.FragmentBookingCompletedBinding
import com.pranjalranasapplication.app.modules.bookingcompleted.`data`.viewmodel.BookingCompletedVM
import kotlin.String
import kotlin.Unit

class BookingCompletedFragment :
    BaseFragment<FragmentBookingCompletedBinding>(R.layout.fragment_booking_completed) {
  private val viewModel: BookingCompletedVM by viewModels<BookingCompletedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.bookingCompletedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BOOKING_COMPLETED_FRAGMENT"

  }
}
