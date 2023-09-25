package com.pranjalranasapplication.app.modules.gallery.`data`.model

import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GalleryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGalleryhotelphoOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gallery_hotel_p)

)
