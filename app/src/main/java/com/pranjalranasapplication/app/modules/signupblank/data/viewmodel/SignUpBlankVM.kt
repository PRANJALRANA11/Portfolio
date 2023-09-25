package com.pranjalranasapplication.app.modules.signupblank.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.pranjalranasapplication.app.modules.signupblank.`data`.model.SignUpBlankModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class SignUpBlankVM : ViewModel(), KoinComponent {
  val signUpBlankModel: MutableLiveData<SignUpBlankModel> = MutableLiveData(SignUpBlankModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount

  var facebookAuthResponse: JSONObject = JSONObject()
}
