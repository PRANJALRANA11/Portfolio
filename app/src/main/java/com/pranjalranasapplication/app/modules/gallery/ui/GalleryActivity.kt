package com.pranjalranasapplication.app.modules.gallery.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityGalleryBinding
import com.pranjalranasapplication.app.modules.gallery.`data`.model.GalleryRowModel
import com.pranjalranasapplication.app.modules.gallery.`data`.viewmodel.GalleryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GalleryActivity : BaseActivity<ActivityGalleryBinding>(R.layout.activity_gallery) {
  private val viewModel: GalleryVM by viewModels<GalleryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val galleryAdapter = GalleryAdapter(viewModel.galleryList.value?:mutableListOf())
    binding.recyclerGallery.adapter = galleryAdapter
    galleryAdapter.setOnItemClickListener(
    object : GalleryAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GalleryRowModel) {
        onClickRecyclerGallery(view, position, item)
      }
    }
    )
    viewModel.galleryList.observe(this) {
      galleryAdapter.updateData(it)
    }
    binding.galleryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerGallery(
    view: View,
    position: Int,
    item: GalleryRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "GALLERY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GalleryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
