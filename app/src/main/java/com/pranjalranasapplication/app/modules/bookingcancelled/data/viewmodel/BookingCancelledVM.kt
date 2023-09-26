package com.pranjalranasapplication.app.modules.bookingcancelled.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.bookingcancelled.`data`.model.BookingCancelledModel
import org.koin.core.KoinComponent

class BookingCancelledVM : ViewModel(), KoinComponent {
  val bookingCancelledModel: MutableLiveData<BookingCancelledModel> =
      MutableLiveData(BookingCancelledModel())

  var navArguments: Bundle? = null
}
