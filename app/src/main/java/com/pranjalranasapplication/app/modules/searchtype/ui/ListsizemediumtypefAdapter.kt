package com.pranjalranasapplication.app.modules.searchtype.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListsizemediumtypef1Binding
import com.pranjalranasapplication.app.modules.searchtype.`data`.model.Listsizemediumtypef1RowModel
import kotlin.Int
import kotlin.collections.List

class ListsizemediumtypefAdapter(
  var list: List<Listsizemediumtypef1RowModel>
) : RecyclerView.Adapter<ListsizemediumtypefAdapter.RowListsizemediumtypef1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsizemediumtypef1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsizemediumtypef1,parent,false)
    return RowListsizemediumtypef1VH(view)
  }

  override fun onBindViewHolder(holder: RowListsizemediumtypef1VH, position: Int) {
    val listsizemediumtypef1RowModel = Listsizemediumtypef1RowModel()
    // TODO uncomment following line after integration with data source
    // val listsizemediumtypef1RowModel = list[position]
    holder.binding.listsizemediumtypef1RowModel = listsizemediumtypef1RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsizemediumtypef1RowModel>) {
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
      item: Listsizemediumtypef1RowModel
    ) {
    }
  }

  inner class RowListsizemediumtypef1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsizemediumtypef1Binding = RowListsizemediumtypef1Binding.bind(itemView)
  }
}
