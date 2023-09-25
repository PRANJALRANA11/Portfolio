package com.pranjalranasapplication.app.modules.homescreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowHotelsBinding
import com.pranjalranasapplication.app.modules.homescreen.`data`.model.HotelsRowModel
import kotlin.Int
import kotlin.collections.List

class HotelsAdapter(
  var list: List<HotelsRowModel>
) : RecyclerView.Adapter<HotelsAdapter.RowHotelsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHotelsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_hotels,parent,false)
    return RowHotelsVH(view)
  }

  override fun onBindViewHolder(holder: RowHotelsVH, position: Int) {
    val hotelsRowModel = HotelsRowModel()
    // TODO uncomment following line after integration with data source
    // val hotelsRowModel = list[position]
    holder.binding.hotelsRowModel = hotelsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HotelsRowModel>) {
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
      item: HotelsRowModel
    ) {
    }
  }

  inner class RowHotelsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHotelsBinding = RowHotelsBinding.bind(itemView)
    init {
      binding.btn48.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, HotelsRowModel())
      }
    }
  }
}
