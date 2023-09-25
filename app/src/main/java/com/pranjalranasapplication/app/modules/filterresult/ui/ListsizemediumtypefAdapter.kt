package com.pranjalranasapplication.app.modules.filterresult.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListsizemediumtypef3Binding
import com.pranjalranasapplication.app.modules.filterresult.`data`.model.Listsizemediumtypef3RowModel
import kotlin.Int
import kotlin.collections.List

class ListsizemediumtypefAdapter(
  var list: List<Listsizemediumtypef3RowModel>
) : RecyclerView.Adapter<ListsizemediumtypefAdapter.RowListsizemediumtypef3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsizemediumtypef3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsizemediumtypef3,parent,false)
    return RowListsizemediumtypef3VH(view)
  }

  override fun onBindViewHolder(holder: RowListsizemediumtypef3VH, position: Int) {
    val listsizemediumtypef3RowModel = Listsizemediumtypef3RowModel()
    // TODO uncomment following line after integration with data source
    // val listsizemediumtypef3RowModel = list[position]
    holder.binding.listsizemediumtypef3RowModel = listsizemediumtypef3RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsizemediumtypef3RowModel>) {
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
      item: Listsizemediumtypef3RowModel
    ) {
    }
  }

  inner class RowListsizemediumtypef3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsizemediumtypef3Binding = RowListsizemediumtypef3Binding.bind(itemView)
  }
}
