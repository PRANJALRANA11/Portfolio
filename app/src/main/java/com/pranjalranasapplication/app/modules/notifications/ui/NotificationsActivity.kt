package com.pranjalranasapplication.app.modules.notifications.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityNotificationsBinding
import com.pranjalranasapplication.app.modules.notifications.`data`.model.Listclock1RowModel
import com.pranjalranasapplication.app.modules.notifications.`data`.model.ListclockRowModel
import com.pranjalranasapplication.app.modules.notifications.`data`.viewmodel.NotificationsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationsActivity :
    BaseActivity<ActivityNotificationsBinding>(R.layout.activity_notifications) {
  private val viewModel: NotificationsVM by viewModels<NotificationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listclockAdapter = ListclockAdapter(viewModel.listclockList.value?:mutableListOf())
    binding.recyclerListclock.adapter = listclockAdapter
    listclockAdapter.setOnItemClickListener(
    object : ListclockAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListclockRowModel) {
        onClickRecyclerListclock(view, position, item)
      }
    }
    )
    viewModel.listclockList.observe(this) {
      listclockAdapter.updateData(it)
    }
    val listclock1Adapter = Listclock1Adapter(viewModel.listclock1List.value?:mutableListOf())
    binding.recyclerListclock1.adapter = listclock1Adapter
    listclock1Adapter.setOnItemClickListener(
    object : Listclock1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listclock1RowModel) {
        onClickRecyclerListclock1(view, position, item)
      }
    }
    )
    viewModel.listclock1List.observe(this) {
      listclock1Adapter.updateData(it)
    }
    binding.notificationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListclock(
    view: View,
    position: Int,
    item: ListclockRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListclock1(
    view: View,
    position: Int,
    item: Listclock1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
