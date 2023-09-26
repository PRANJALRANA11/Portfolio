package com.pranjalranasapplication.app.modules.searchfilter.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListstarBinding
import com.pranjalranasapplication.app.modules.searchfilter.`data`.model.ListstarRowModel
import kotlin.Int
import kotlin.collections.List

class ListstarAdapter(
  var list: List<ListstarRowModel>
) : RecyclerView.Adapter<ListstarAdapter.RowListstarVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListstarVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_liststar,parent,false)
    return RowListstarVH(view)
  }

  override fun onBindViewHolder(holder: RowListstarVH, position: Int) {
    val liststarRowModel = ListstarRowModel()
    // TODO uncomment following line after integration with data source
    // val liststarRowModel = list[position]
    holder.binding.liststarRowModel = liststarRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListstarRowModel>) {
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
      item: ListstarRowModel
    ) {
    }
  }

  inner class RowListstarVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListstarBinding = RowListstarBinding.bind(itemView)
  }
}
