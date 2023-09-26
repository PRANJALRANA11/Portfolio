package com.pranjalranasapplication.app.modules.homescreen.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseFragment
import com.pranjalranasapplication.app.databinding.FragmentHomeScreenBinding
import com.pranjalranasapplication.app.modules.homescreen.`data`.model.HotelsRowModel
import com.pranjalranasapplication.app.modules.homescreen.`data`.model.ListrectanglefourRowModel
import com.pranjalranasapplication.app.modules.homescreen.`data`.model.OptionsRowModel
import com.pranjalranasapplication.app.modules.homescreen.`data`.viewmodel.HomeScreenVM
import com.pranjalranasapplication.app.modules.mybookmarks.ui.MyBookmarksActivity
import com.pranjalranasapplication.app.modules.notifications.ui.NotificationsActivity
import com.pranjalranasapplication.app.modules.recentlybooked.ui.RecentlyBookedActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeScreenFragment : BaseFragment<FragmentHomeScreenBinding>(R.layout.fragment_home_screen) {
  private val viewModel: HomeScreenVM by viewModels<HomeScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val optionsAdapter = OptionsAdapter(viewModel.optionsList.value?:mutableListOf())
    binding.recyclerOptions.adapter = optionsAdapter
    optionsAdapter.setOnItemClickListener(
    object : OptionsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OptionsRowModel) {
        onClickRecyclerOptions(view, position, item)
      }
    }
    )
    viewModel.optionsList.observe(requireActivity()) {
      optionsAdapter.updateData(it)
    }
    val hotelsAdapter = HotelsAdapter(viewModel.hotelsList.value?:mutableListOf())
    binding.recyclerHotels.adapter = hotelsAdapter
    hotelsAdapter.setOnItemClickListener(
    object : HotelsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HotelsRowModel) {
        onClickRecyclerHotels(view, position, item)
      }
    }
    )
    viewModel.hotelsList.observe(requireActivity()) {
      hotelsAdapter.updateData(it)
    }
    val listrectanglefourAdapter =
    ListrectanglefourAdapter(viewModel.listrectanglefourList.value?:mutableListOf())
    binding.recyclerListrectanglefour.adapter = listrectanglefourAdapter
    listrectanglefourAdapter.setOnItemClickListener(
    object : ListrectanglefourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectanglefourRowModel) {
        onClickRecyclerListrectanglefour(view, position, item)
      }
    }
    )
    viewModel.listrectanglefourList.observe(requireActivity()) {
      listrectanglefourAdapter.updateData(it)
    }
    binding.homeScreenVM = viewModel
    setUpSearchViewSearchbarListener()
  }

  override fun setUpClicks(): Unit {
    binding.txtSeeall.setOnClickListener {
      val destIntent = RecentlyBookedActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageBag.setOnClickListener {
      val destIntent = MyBookmarksActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageAlarm.setOnClickListener {
      val destIntent = NotificationsActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerOptions(
    view: View,
    position: Int,
    item: OptionsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerHotels(
    view: View,
    position: Int,
    item: HotelsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectanglefour(
    view: View,
    position: Int,
    item: ListrectanglefourRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchbarListener(): Unit {
    binding.searchViewSearchbar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "HOME_SCREEN_FRAGMENT"


      fun getInstance(bundle: Bundle?): HomeScreenFragment {
        val fragment = HomeScreenFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
