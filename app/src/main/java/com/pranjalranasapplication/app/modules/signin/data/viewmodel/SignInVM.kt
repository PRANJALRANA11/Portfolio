package com.pranjalranasapplication.app.modules.signin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.pranjalranasapplication.app.appcomponents.utility.PreferenceHelper
import com.pranjalranasapplication.app.modules.signin.`data`.model.SignInModel
import com.pranjalranasapplication.app.network.models.createlogin.CreateLoginRequest
import com.pranjalranasapplication.app.network.models.createlogin.CreateLoginResponse
import com.pranjalranasapplication.app.network.repository.NetworkRepository
import com.pranjalranasapplication.app.network.resources.Response
import kotlin.Boolean
import kotlin.Unit
import kotlinx.coroutines.launch
import org.json.JSONObject
import org.koin.core.KoinComponent
import org.koin.core.inject

class SignInVM : ViewModel(), KoinComponent {
  val signInModel: MutableLiveData<SignInModel> = MutableLiveData(SignInModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()


  private val networkRepository: NetworkRepository by inject()

  val createLoginLiveData: MutableLiveData<Response<CreateLoginResponse>> =
      MutableLiveData<Response<CreateLoginResponse>>()


  private val prefs: PreferenceHelper by inject()

  var facebookAuthResponse: JSONObject = JSONObject()


  lateinit var googleAuthResponse: GoogleSignInAccount

  fun callCreateLoginApi(): Unit {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createLoginLiveData.postValue(
      networkRepository.createLogin(
      createLoginRequest = CreateLoginRequest(
      password = signInModel.value?.etPasswordValue,
      username = signInModel.value?.etEmailValue)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateLoginResponse(response: CreateLoginResponse): Unit {
    val signInModelValue = signInModel.value ?:SignInModel()
    prefs.setToken(response.data?.token)
    signInModel.value = signInModelValue
  }
}
