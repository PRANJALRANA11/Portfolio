package com.pranjalranasapplication.app.modules.addnewcard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityAddNewCardBinding
import com.pranjalranasapplication.app.modules.addnewcard.`data`.viewmodel.AddNewCardVM
import com.pranjalranasapplication.app.modules.cardadded.ui.CardAddedActivity
import kotlin.String
import kotlin.Unit

class AddNewCardActivity : BaseActivity<ActivityAddNewCardBinding>(R.layout.activity_add_new_card) {
  private val viewModel: AddNewCardVM by viewModels<AddNewCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addNewCardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnAddNewCard.setOnClickListener {
      val destIntent = CardAddedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADD_NEW_CARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddNewCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
