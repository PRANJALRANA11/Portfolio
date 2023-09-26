package com.pranjalranasapplication.app.modules.bookingcompleted.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.bookingcompleted.`data`.model.BookingCompletedModel
import org.koin.core.KoinComponent

class BookingCompletedVM : ViewModel(), KoinComponent {
  val bookingCompletedModel: MutableLiveData<BookingCompletedModel> =
      MutableLiveData(BookingCompletedModel())

  var navArguments: Bundle? = null
}
