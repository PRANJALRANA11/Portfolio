package com.pranjalranasapplication.app.modules.hoteldetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowDetailsBinding
import com.pranjalranasapplication.app.modules.hoteldetails.`data`.model.DetailsRowModel
import kotlin.Int
import kotlin.collections.List

class HotelDetailsAdapter(
  var list: List<DetailsRowModel>
) : RecyclerView.Adapter<HotelDetailsAdapter.RowDetailsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDetailsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_details,parent,false)
    return RowDetailsVH(view)
  }

  override fun onBindViewHolder(holder: RowDetailsVH, position: Int) {
    val detailsRowModel = DetailsRowModel()
    // TODO uncomment following line after integration with data source
    // val detailsRowModel = list[position]
    holder.binding.detailsRowModel = detailsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DetailsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: DetailsRowModel
    ) {
    }
  }

  inner class RowDetailsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDetailsBinding = RowDetailsBinding.bind(itemView)
    init {
      binding.btnFive.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DetailsRowModel())
      }
    }
  }
}
