package com.pranjalranasapplication.app.modules.refundmethod.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityRefundMethodBinding
import com.pranjalranasapplication.app.modules.cancelationsuccessful.ui.CancelationSuccessfulDialog
import com.pranjalranasapplication.app.modules.refundmethod.`data`.model.MethodRowModel
import com.pranjalranasapplication.app.modules.refundmethod.`data`.viewmodel.RefundMethodVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RefundMethodActivity :
    BaseActivity<ActivityRefundMethodBinding>(R.layout.activity_refund_method) {
  private val viewModel: RefundMethodVM by viewModels<RefundMethodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val refundMethodAdapter =
    RefundMethodAdapter(viewModel.refundMethodList.value?:mutableListOf())
    binding.recyclerRefundMethod.adapter = refundMethodAdapter
    refundMethodAdapter.setOnItemClickListener(
    object : RefundMethodAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MethodRowModel) {
        onClickRecyclerRefundMethod(view, position, item)
      }
    }
    )
    viewModel.refundMethodList.observe(this) {
      refundMethodAdapter.updateData(it)
    }
    binding.refundMethodVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnConfirmCancellation.setOnClickListener {
      val destFragment = CancelationSuccessfulDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, CancelationSuccessfulDialog.TAG)
    }
  }

  fun onClickRecyclerRefundMethod(
    view: View,
    position: Int,
    item: MethodRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REFUND_METHOD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RefundMethodActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
