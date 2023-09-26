package com.pranjalranasapplication.app.modules.fillprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pranjalranasapplication.app.appcomponents.utility.PreferenceHelper
import com.pranjalranasapplication.app.constants.user
import com.pranjalranasapplication.app.modules.fillprofile.`data`.model.FillProfileModel
import com.pranjalranasapplication.app.modules.fillprofile.`data`.model.SpinnerGenderModel
import com.pranjalranasapplication.app.network.models.createregister.CreateRegisterRequest
import com.pranjalranasapplication.app.network.models.createregister.CreateRegisterResponse
import com.pranjalranasapplication.app.network.repository.NetworkRepository
import com.pranjalranasapplication.app.network.resources.Response
import kotlin.Boolean
import kotlin.collections.MutableList
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class FillProfileVM : ViewModel(), KoinComponent {
  val fillProfileModel: MutableLiveData<FillProfileModel> = MutableLiveData(FillProfileModel())


  var navArguments: Bundle? = null


  val spinnerGenderList: MutableLiveData<MutableList<SpinnerGenderModel>> = MutableLiveData()


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val createRegisterLiveData: MutableLiveData<Response<CreateRegisterResponse>> =
      MutableLiveData<Response<CreateRegisterResponse>>()

  private val prefs: PreferenceHelper by inject()

  fun callCreateRegisterApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createRegisterLiveData.postValue(
      networkRepository.createRegister(
      createRegisterRequest = CreateRegisterRequest(
          password = user.PASSWROD,
          role = user.ROLE,
          name = fillProfileModel.value?.etFullnameValue,
          email = fillProfileModel.value?.etEmailValue,
          username = fillProfileModel.value?.etNicknameValue)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateRegisterResponse(response: CreateRegisterResponse) {
    val fillProfileModelValue = fillProfileModel.value ?:FillProfileModel()
    prefs.setId(response.data?.id)
    fillProfileModel.value = fillProfileModelValue
  }
}
