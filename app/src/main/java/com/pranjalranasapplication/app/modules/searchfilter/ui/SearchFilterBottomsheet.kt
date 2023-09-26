package com.pranjalranasapplication.app.modules.searchfilter.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.pranjalranasapplication.app.databinding.BottomsheetSearchFilterBinding
import com.pranjalranasapplication.app.modules.filterresult.ui.FilterResultActivity
import com.pranjalranasapplication.app.modules.searchfilter.`data`.model.ListcountryRowModel
import com.pranjalranasapplication.app.modules.searchfilter.`data`.model.Listsizemediumtypef2RowModel
import com.pranjalranasapplication.app.modules.searchfilter.`data`.model.ListstarRowModel
import com.pranjalranasapplication.app.modules.searchfilter.`data`.viewmodel.SearchFilterVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchFilterBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetSearchFilterBinding>(R.layout.bottomsheet_search_filter)
    {
  private val viewModel: SearchFilterVM by viewModels<SearchFilterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listcountryAdapter =
    ListcountryAdapter(viewModel.listcountryList.value?:mutableListOf())
    binding.recyclerListcountry.adapter = listcountryAdapter
    listcountryAdapter.setOnItemClickListener(
    object : ListcountryAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcountryRowModel) {
        onClickRecyclerListcountry(view, position, item)
      }
    }
    )
    viewModel.listcountryList.observe(requireActivity()) {
      listcountryAdapter.updateData(it)
    }
    val listsizemediumtypefAdapter =
    ListsizemediumtypefAdapter(viewModel.listsizemediumtypefList.value?:mutableListOf())
    binding.recyclerListsizemediumtypef.adapter = listsizemediumtypefAdapter
    listsizemediumtypefAdapter.setOnItemClickListener(
    object : ListsizemediumtypefAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listsizemediumtypef2RowModel) {
        onClickRecyclerListsizemediumtypef(view, position, item)
      }
    }
    )
    viewModel.listsizemediumtypefList.observe(requireActivity()) {
      listsizemediumtypefAdapter.updateData(it)
    }
    val liststarAdapter = ListstarAdapter(viewModel.liststarList.value?:mutableListOf())
    binding.recyclerListstar.adapter = liststarAdapter
    liststarAdapter.setOnItemClickListener(
    object : ListstarAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListstarRowModel) {
        onClickRecyclerListstar(view, position, item)
      }
    }
    )
    viewModel.liststarList.observe(requireActivity()) {
      liststarAdapter.updateData(it)
    }
    binding.searchFilterVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnApplyFilter.setOnClickListener {
      val destIntent = FilterResultActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  fun onClickRecyclerListcountry(
    view: View,
    position: Int,
    item: ListcountryRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListsizemediumtypef(
    view: View,
    position: Int,
    item: Listsizemediumtypef2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListstar(
    view: View,
    position: Int,
    item: ListstarRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_FILTER_BOTTOMSHEET"

  }
}
