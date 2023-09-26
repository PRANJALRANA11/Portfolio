package com.pranjalranasapplication.app.modules.gallery.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pranjalranasapplication.app.modules.gallery.`data`.model.GalleryModel
import com.pranjalranasapplication.app.modules.gallery.`data`.model.GalleryRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class GalleryVM : ViewModel(), KoinComponent {
  val galleryModel: MutableLiveData<GalleryModel> = MutableLiveData(GalleryModel())

  var navArguments: Bundle? = null

  val galleryList: MutableLiveData<MutableList<GalleryRowModel>> = MutableLiveData(mutableListOf())
}
