package com.pranjalranasapplication.app.modules.filterresult.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityFilterResultBinding
import com.pranjalranasapplication.app.modules.filterresult.`data`.model.Listrectanglefour3RowModel
import com.pranjalranasapplication.app.modules.filterresult.`data`.model.Listsizemediumtypef3RowModel
import com.pranjalranasapplication.app.modules.filterresult.`data`.viewmodel.FilterResultVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FilterResultActivity :
    BaseActivity<ActivityFilterResultBinding>(R.layout.activity_filter_result) {
  private val viewModel: FilterResultVM by viewModels<FilterResultVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsizemediumtypefAdapter =
    ListsizemediumtypefAdapter(viewModel.listsizemediumtypefList.value?:mutableListOf())
    binding.recyclerListsizemediumtypef.adapter = listsizemediumtypefAdapter
    listsizemediumtypefAdapter.setOnItemClickListener(
    object : ListsizemediumtypefAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listsizemediumtypef3RowModel) {
        onClickRecyclerListsizemediumtypef(view, position, item)
      }
    }
    )
    viewModel.listsizemediumtypefList.observe(this) {
      listsizemediumtypefAdapter.updateData(it)
    }
    val listrectanglefourAdapter =
    ListrectanglefourAdapter(viewModel.listrectanglefourList.value?:mutableListOf())
    binding.recyclerListrectanglefour.adapter = listrectanglefourAdapter
    listrectanglefourAdapter.setOnItemClickListener(
    object : ListrectanglefourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectanglefour3RowModel) {
        onClickRecyclerListrectanglefour(view, position, item)
      }
    }
    )
    viewModel.listrectanglefourList.observe(this) {
      listrectanglefourAdapter.updateData(it)
    }
    binding.filterResultVM = viewModel
    setUpSearchViewSearchbarListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListsizemediumtypef(
    view: View,
    position: Int,
    item: Listsizemediumtypef3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectanglefour(
    view: View,
    position: Int,
    item: Listrectanglefour3RowModel
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
      const val TAG: String = "FILTER_RESULT_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, FilterResultActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
