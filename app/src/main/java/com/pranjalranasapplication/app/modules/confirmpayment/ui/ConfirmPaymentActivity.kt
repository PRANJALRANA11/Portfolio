package com.pranjalranasapplication.app.modules.confirmpayment.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityConfirmPaymentBinding
import com.pranjalranasapplication.app.modules.cardadded.ui.CardAddedActivity
import com.pranjalranasapplication.app.modules.confirmpayment.`data`.model.ListcheckinRowModel
import com.pranjalranasapplication.app.modules.confirmpayment.`data`.viewmodel.ConfirmPaymentVM
import com.pranjalranasapplication.app.modules.paymentsuccessful.ui.PaymentSuccessfulDialog
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ConfirmPaymentActivity :
    BaseActivity<ActivityConfirmPaymentBinding>(R.layout.activity_confirm_payment) {
  private val viewModel: ConfirmPaymentVM by viewModels<ConfirmPaymentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listcheckinAdapter =
    ListcheckinAdapter(viewModel.listcheckinList.value?:mutableListOf())
    binding.recyclerListcheckin.adapter = listcheckinAdapter
    listcheckinAdapter.setOnItemClickListener(
    object : ListcheckinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcheckinRowModel) {
        onClickRecyclerListcheckin(view, position, item)
      }
    }
    )
    viewModel.listcheckinList.observe(this) {
      listcheckinAdapter.updateData(it)
    }
    binding.confirmPaymentVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnConfirmPayment.setOnClickListener {
      val destFragment = PaymentSuccessfulDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, PaymentSuccessfulDialog.TAG)
    }
    binding.txtChange.setOnClickListener {
      val destIntent = CardAddedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListcheckin(
    view: View,
    position: Int,
    item: ListcheckinRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CONFIRM_PAYMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConfirmPaymentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
