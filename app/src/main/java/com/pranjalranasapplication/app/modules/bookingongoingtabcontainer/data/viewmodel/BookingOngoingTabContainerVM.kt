package com.pranjalranasapplication.app.modules.bookingongoingtabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.bookingongoingtabcontainer.`data`.model.BookingOngoingTabContainerModel
import org.koin.core.KoinComponent

class BookingOngoingTabContainerVM : ViewModel(), KoinComponent {
  val bookingOngoingTabContainerModel: MutableLiveData<BookingOngoingTabContainerModel> =
      MutableLiveData(BookingOngoingTabContainerModel())

  var navArguments: Bundle? = null
}
