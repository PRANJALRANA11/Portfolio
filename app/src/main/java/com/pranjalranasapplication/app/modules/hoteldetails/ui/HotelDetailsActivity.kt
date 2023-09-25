package com.pranjalranasapplication.app.modules.hoteldetails.ui

import android.view.View
import androidx.activity.viewModels
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityHotelDetailsBinding
import com.pranjalranasapplication.app.modules.gallery.ui.GalleryActivity
import com.pranjalranasapplication.app.modules.hoteldetails.`data`.model.DetailsRowModel
import com.pranjalranasapplication.app.modules.hoteldetails.`data`.model.SpinnerTypebuttontypeModel
import com.pranjalranasapplication.app.modules.hoteldetails.`data`.viewmodel.HotelDetailsVM
import com.pranjalranasapplication.app.modules.review.ui.ReviewActivity
import com.pranjalranasapplication.app.modules.selectdateguest.ui.SelectDateGuestActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HotelDetailsActivity :
    BaseActivity<ActivityHotelDetailsBinding>(R.layout.activity_hotel_details), OnMapReadyCallback {
  private val viewModel: HotelDetailsVM by viewModels<HotelDetailsVM>()

  private var mMap: GoogleMap? = null


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerTypebuttontypeList.value = mutableListOf(
    SpinnerTypebuttontypeModel("Item1"),
    SpinnerTypebuttontypeModel("Item2"),
    SpinnerTypebuttontypeModel("Item3"),
    SpinnerTypebuttontypeModel("Item4"),
    SpinnerTypebuttontypeModel("Item5")
    )
    val spinnerTypebuttontypeAdapter =
    SpinnerTypebuttontypeAdapter(this,R.layout.spinner_item,viewModel.spinnerTypebuttontypeList.value?:
    mutableListOf())
    binding.spinnerTypebuttontype.adapter = spinnerTypebuttontypeAdapter
    val hotelDetailsAdapter =
    HotelDetailsAdapter(viewModel.hotelDetailsList.value?:mutableListOf())
    binding.recyclerHotelDetails.adapter = hotelDetailsAdapter
    hotelDetailsAdapter.setOnItemClickListener(
    object : HotelDetailsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DetailsRowModel) {
        onClickRecyclerHotelDetails(view, position, item)
      }
    }
    )
    viewModel.hotelDetailsList.observe(this) {
      hotelDetailsAdapter.updateData(it)
    }
    binding.hotelDetailsVM = viewModel
    val mapFragment = supportFragmentManager.findFragmentById(R.id.mapImageFive) as?
    SupportMapFragment
    mapFragment?.getMapAsync(this)
  }

  override fun onMapReady(p0: GoogleMap): Unit {
    mMap = p0
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtSeeall.setOnClickListener {
      val destIntent = GalleryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSeeallOne.setOnClickListener {
      val destIntent = ReviewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBookNow.setOnClickListener {
      val destIntent = SelectDateGuestActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHotelDetails(
    view: View,
    position: Int,
    item: DetailsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOTEL_DETAILS_ACTIVITY"

  }
}
