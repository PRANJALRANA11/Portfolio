package com.pranjalranasapplication.app.modules.bookingongoingtabcontainer.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseFragment
import com.pranjalranasapplication.app.databinding.FragmentBookingOngoingTabContainerBinding
import com.pranjalranasapplication.app.modules.bookingongoingtabcontainer.`data`.viewmodel.BookingOngoingTabContainerVM
import kotlin.String
import kotlin.Unit

class BookingOngoingTabContainerFragment :
    BaseFragment<FragmentBookingOngoingTabContainerBinding>(R.layout.fragment_booking_ongoing_tab_container)
    {
  private val viewModel: BookingOngoingTabContainerVM by viewModels<BookingOngoingTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.bookingOngoingTabContainerVM = viewModel
    val adapter = BookingOngoingTabContainerFragmentPagerAdapter(childFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup137,binding.viewPagerTabbarview) { tab, position ->
      tab.text = BookingOngoingTabContainerFragmentPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "BOOKING_ONGOING_TAB_CONTAINER_FRAGMENT"


      fun getInstance(bundle: Bundle?): BookingOngoingTabContainerFragment {
        val fragment = BookingOngoingTabContainerFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
