package com.pranjalranasapplication.app.modules.bookingname.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.bookingname.`data`.model.BookingNameModel
import org.koin.core.KoinComponent

class BookingNameVM : ViewModel(), KoinComponent {
  val bookingNameModel: MutableLiveData<BookingNameModel> = MutableLiveData(BookingNameModel())

  var navArguments: Bundle? = null
}
