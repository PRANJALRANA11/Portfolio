package com.pranjalranasapplication.app.modules.searchfilter.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListsizemediumtypef2Binding
import com.pranjalranasapplication.app.modules.searchfilter.`data`.model.Listsizemediumtypef2RowModel
import kotlin.Int
import kotlin.collections.List

class ListsizemediumtypefAdapter(
  var list: List<Listsizemediumtypef2RowModel>
) : RecyclerView.Adapter<ListsizemediumtypefAdapter.RowListsizemediumtypef2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsizemediumtypef2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsizemediumtypef2,parent,false)
    return RowListsizemediumtypef2VH(view)
  }

  override fun onBindViewHolder(holder: RowListsizemediumtypef2VH, position: Int) {
    val listsizemediumtypef2RowModel = Listsizemediumtypef2RowModel()
    // TODO uncomment following line after integration with data source
    // val listsizemediumtypef2RowModel = list[position]
    holder.binding.listsizemediumtypef2RowModel = listsizemediumtypef2RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsizemediumtypef2RowModel>) {
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
      item: Listsizemediumtypef2RowModel
    ) {
    }
  }

  inner class RowListsizemediumtypef2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsizemediumtypef2Binding = RowListsizemediumtypef2Binding.bind(itemView)
  }
}
