package com.pranjalranasapplication.app.modules.searchpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListsizemediumtypefBinding
import com.pranjalranasapplication.app.modules.searchpage.`data`.model.ListsizemediumtypefRowModel
import kotlin.Int
import kotlin.collections.List

class ListsizemediumtypefAdapter(
  var list: List<ListsizemediumtypefRowModel>
) : RecyclerView.Adapter<ListsizemediumtypefAdapter.RowListsizemediumtypefVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsizemediumtypefVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsizemediumtypef,parent,false)
    return RowListsizemediumtypefVH(view)
  }

  override fun onBindViewHolder(holder: RowListsizemediumtypefVH, position: Int) {
    val listsizemediumtypefRowModel = ListsizemediumtypefRowModel()
    // TODO uncomment following line after integration with data source
    // val listsizemediumtypefRowModel = list[position]
    holder.binding.listsizemediumtypefRowModel = listsizemediumtypefRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsizemediumtypefRowModel>) {
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
      item: ListsizemediumtypefRowModel
    ) {
    }
  }

  inner class RowListsizemediumtypefVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsizemediumtypefBinding = RowListsizemediumtypefBinding.bind(itemView)
  }
}
