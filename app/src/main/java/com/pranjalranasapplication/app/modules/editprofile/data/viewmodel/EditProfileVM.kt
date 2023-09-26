package com.pranjalranasapplication.app.modules.editprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pranjalranasapplication.app.modules.editprofile.`data`.model.EditProfileModel
import com.pranjalranasapplication.app.modules.editprofile.`data`.model.SpinnerCountryModel
import com.pranjalranasapplication.app.modules.editprofile.`data`.model.SpinnerGenderModel
import com.pranjalranasapplication.app.network.models.fetchme.FetchMeResponse
import com.pranjalranasapplication.app.network.repository.NetworkRepository
import com.pranjalranasapplication.app.network.resources.Response
import kotlin.Boolean
import kotlin.collections.MutableList
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class EditProfileVM : ViewModel(), KoinComponent {
  val editProfileModel: MutableLiveData<EditProfileModel> = MutableLiveData(EditProfileModel())


  var navArguments: Bundle? = null


  val spinnerCountryList: MutableLiveData<MutableList<SpinnerCountryModel>> = MutableLiveData()


  val spinnerGenderList: MutableLiveData<MutableList<SpinnerGenderModel>> = MutableLiveData()


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val fetchMeLiveData: MutableLiveData<Response<FetchMeResponse>> =
      MutableLiveData<Response<FetchMeResponse>>()

  fun callFetchMeApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      fetchMeLiveData.postValue(
      networkRepository.fetchMe()
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindFetchMeResponse(response: FetchMeResponse) {
    val editProfileModelValue = editProfileModel.value ?:EditProfileModel()
    editProfileModelValue.etFirstnameValue = response.data?.username.toString()
    editProfileModelValue.etEmailValue = response.data?.email.toString()
    editProfileModelValue.etStatusfilltypedValue = response.data?.name.toString()
    editProfileModel.value = editProfileModelValue
  }
}
