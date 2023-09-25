package com.pranjalranasapplication.app.modules.hoteldetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.hoteldetails.`data`.model.DetailsRowModel
import com.pranjalranasapplication.app.modules.hoteldetails.`data`.model.HotelDetailsModel
import com.pranjalranasapplication.app.modules.hoteldetails.`data`.model.SpinnerTypebuttontypeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HotelDetailsVM : ViewModel(), KoinComponent {
  val hotelDetailsModel: MutableLiveData<HotelDetailsModel> = MutableLiveData(HotelDetailsModel())

  var navArguments: Bundle? = null

  val spinnerTypebuttontypeList: MutableLiveData<MutableList<SpinnerTypebuttontypeModel>> =
      MutableLiveData()

  val hotelDetailsList: MutableLiveData<MutableList<DetailsRowModel>> =
      MutableLiveData(mutableListOf())
}
