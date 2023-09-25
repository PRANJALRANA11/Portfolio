package com.pranjalranasapplication.app.modules.viewticket.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityViewTicketBinding
import com.pranjalranasapplication.app.modules.viewticket.`data`.model.TicketRowModel
import com.pranjalranasapplication.app.modules.viewticket.`data`.viewmodel.ViewTicketVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ViewTicketActivity : BaseActivity<ActivityViewTicketBinding>(R.layout.activity_view_ticket) {
  private val viewModel: ViewTicketVM by viewModels<ViewTicketVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val viewTicketAdapter = ViewTicketAdapter(viewModel.viewTicketList.value?:mutableListOf())
    binding.recyclerViewTicket.adapter = viewTicketAdapter
    viewTicketAdapter.setOnItemClickListener(
    object : ViewTicketAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TicketRowModel) {
        onClickRecyclerViewTicket(view, position, item)
      }
    }
    )
    viewModel.viewTicketList.observe(this) {
      viewTicketAdapter.updateData(it)
    }
    binding.viewTicketVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerViewTicket(
    view: View,
    position: Int,
    item: TicketRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "VIEW_TICKET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ViewTicketActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
