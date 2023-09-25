package com.pranjalranasapplication.app.modules.bookingongoing.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.bookingongoing.`data`.model.BookingOngoingModel
import com.pranjalranasapplication.app.modules.bookingongoing.`data`.model.ListrectangleRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BookingOngoingVM : ViewModel(), KoinComponent {
  val bookingOngoingModel: MutableLiveData<BookingOngoingModel> =
      MutableLiveData(BookingOngoingModel())

  var navArguments: Bundle? = null

  val listrectangleList: MutableLiveData<MutableList<ListrectangleRowModel>> =
      MutableLiveData(mutableListOf())
}
