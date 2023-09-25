package com.pranjalranasapplication.app.modules.addnewcard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.addnewcard.`data`.model.AddNewCardModel
import org.koin.core.KoinComponent

class AddNewCardVM : ViewModel(), KoinComponent {
  val addNewCardModel: MutableLiveData<AddNewCardModel> = MutableLiveData(AddNewCardModel())

  var navArguments: Bundle? = null
}
