package com.pranjalranasapplication.app.modules.choosepaymentmethod.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityChoosePaymentMethodBinding
import com.pranjalranasapplication.app.modules.addnewcard.ui.AddNewCardActivity
import com.pranjalranasapplication.app.modules.choosepaymentmethod.`data`.model.ListreplyRowModel
import com.pranjalranasapplication.app.modules.choosepaymentmethod.`data`.viewmodel.ChoosePaymentMethodVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChoosePaymentMethodActivity :
    BaseActivity<ActivityChoosePaymentMethodBinding>(R.layout.activity_choose_payment_method) {
  private val viewModel: ChoosePaymentMethodVM by viewModels<ChoosePaymentMethodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listreplyAdapter = ListreplyAdapter(viewModel.listreplyList.value?:mutableListOf())
    binding.recyclerListreply.adapter = listreplyAdapter
    listreplyAdapter.setOnItemClickListener(
    object : ListreplyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListreplyRowModel) {
        onClickRecyclerListreply(view, position, item)
      }
    }
    )
    viewModel.listreplyList.observe(this) {
      listreplyAdapter.updateData(it)
    }
    binding.choosePaymentMethodVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtAddnewcard.setOnClickListener {
      val destIntent = AddNewCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = AddNewCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListreply(
    view: View,
    position: Int,
    item: ListreplyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHOOSE_PAYMENT_METHOD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChoosePaymentMethodActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
