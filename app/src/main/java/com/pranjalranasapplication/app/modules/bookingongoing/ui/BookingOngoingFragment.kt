package com.pranjalranasapplication.app.modules.bookingongoing.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseFragment
import com.pranjalranasapplication.app.databinding.FragmentBookingOngoingBinding
import com.pranjalranasapplication.app.modules.bookingongoing.`data`.model.ListrectangleRowModel
import com.pranjalranasapplication.app.modules.bookingongoing.`data`.viewmodel.BookingOngoingVM
import com.pranjalranasapplication.app.modules.cancelbooking.ui.CancelBookingBottomsheet
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BookingOngoingFragment :
    BaseFragment<FragmentBookingOngoingBinding>(R.layout.fragment_booking_ongoing) {
  private val viewModel: BookingOngoingVM by viewModels<BookingOngoingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listrectangleAdapter =
    ListrectangleAdapter(viewModel.listrectangleList.value?:mutableListOf())
    binding.recyclerListrectangle.adapter = listrectangleAdapter
    listrectangleAdapter.setOnItemClickListener(
    object : ListrectangleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectangleRowModel) {
        onClickRecyclerListrectangle(view, position, item)
      }
    }
    )
    viewModel.listrectangleList.observe(requireActivity()) {
      listrectangleAdapter.updateData(it)
    }
    binding.bookingOngoingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectangle(
    view: View,
    position: Int,
    item: ListrectangleRowModel
  ): Unit {
    when(view.id) {
      R.id.btnCancelBooking ->  {
        val destFragment = CancelBookingBottomsheet.getInstance(null)
        destFragment.show(requireActivity().supportFragmentManager, CancelBookingBottomsheet.TAG)
      }
    }
  }

  companion object {
    const val TAG: String = "BOOKING_ONGOING_FRAGMENT"

  }
}
