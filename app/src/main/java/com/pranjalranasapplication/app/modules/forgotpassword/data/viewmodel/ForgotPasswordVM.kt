package com.pranjalranasapplication.app.modules.forgotpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.forgotpassword.`data`.model.ForgotPasswordModel
import com.pranjalranasapplication.app.modules.forgotpassword.`data`.model.ListvolumeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ForgotPasswordVM : ViewModel(), KoinComponent {
  val forgotPasswordModel: MutableLiveData<ForgotPasswordModel> =
      MutableLiveData(ForgotPasswordModel())

  var navArguments: Bundle? = null

  val listvolumeList: MutableLiveData<MutableList<ListvolumeRowModel>> =
      MutableLiveData(mutableListOf())
}
