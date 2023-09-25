package com.pranjalranasapplication.app.modules.searchpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListrectanglefour1Binding
import com.pranjalranasapplication.app.modules.searchpage.`data`.model.Listrectanglefour1RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefourAdapter(
  var list: List<Listrectanglefour1RowModel>
) : RecyclerView.Adapter<ListrectanglefourAdapter.RowListrectanglefour1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefour1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefour1,parent,false)
    return RowListrectanglefour1VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefour1VH, position: Int) {
    val listrectanglefour1RowModel = Listrectanglefour1RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefour1RowModel = list[position]
    holder.binding.listrectanglefour1RowModel = listrectanglefour1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectanglefour1RowModel>) {
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
      item: Listrectanglefour1RowModel
    ) {
    }
  }

  inner class RowListrectanglefour1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefour1Binding = RowListrectanglefour1Binding.bind(itemView)
  }
}
