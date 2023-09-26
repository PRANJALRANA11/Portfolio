package com.pranjalranasapplication.app.modules.recentlybooked.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityRecentlyBookedBinding
import com.pranjalranasapplication.app.modules.recentlybooked.`data`.model.Listrectanglefour2RowModel
import com.pranjalranasapplication.app.modules.recentlybooked.`data`.viewmodel.RecentlyBookedVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecentlyBookedActivity :
    BaseActivity<ActivityRecentlyBookedBinding>(R.layout.activity_recently_booked) {
  private val viewModel: RecentlyBookedVM by viewModels<RecentlyBookedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglefourAdapter =
    ListrectanglefourAdapter(viewModel.listrectanglefourList.value?:mutableListOf())
    binding.recyclerListrectanglefour.adapter = listrectanglefourAdapter
    listrectanglefourAdapter.setOnItemClickListener(
    object : ListrectanglefourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectanglefour2RowModel) {
        onClickRecyclerListrectanglefour(view, position, item)
      }
    }
    )
    viewModel.listrectanglefourList.observe(this) {
      listrectanglefourAdapter.updateData(it)
    }
    binding.recentlyBookedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListrectanglefour(
    view: View,
    position: Int,
    item: Listrectanglefour2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "RECENTLY_BOOKED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecentlyBookedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
