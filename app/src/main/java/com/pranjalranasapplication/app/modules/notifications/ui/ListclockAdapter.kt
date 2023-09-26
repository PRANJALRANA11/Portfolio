package com.pranjalranasapplication.app.modules.notifications.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListclockBinding
import com.pranjalranasapplication.app.modules.notifications.`data`.model.ListclockRowModel
import kotlin.Int
import kotlin.collections.List

class ListclockAdapter(
  var list: List<ListclockRowModel>
) : RecyclerView.Adapter<ListclockAdapter.RowListclockVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListclockVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listclock,parent,false)
    return RowListclockVH(view)
  }

  override fun onBindViewHolder(holder: RowListclockVH, position: Int) {
    val listclockRowModel = ListclockRowModel()
    // TODO uncomment following line after integration with data source
    // val listclockRowModel = list[position]
    holder.binding.listclockRowModel = listclockRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListclockRowModel>) {
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
      item: ListclockRowModel
    ) {
    }
  }

  inner class RowListclockVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListclockBinding = RowListclockBinding.bind(itemView)
  }
}
