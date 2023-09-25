package com.pranjalranasapplication.app.modules.filterresult.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListrectanglefour3Binding
import com.pranjalranasapplication.app.modules.filterresult.`data`.model.Listrectanglefour3RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefourAdapter(
  var list: List<Listrectanglefour3RowModel>
) : RecyclerView.Adapter<ListrectanglefourAdapter.RowListrectanglefour3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefour3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefour3,parent,false)
    return RowListrectanglefour3VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefour3VH, position: Int) {
    val listrectanglefour3RowModel = Listrectanglefour3RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefour3RowModel = list[position]
    holder.binding.listrectanglefour3RowModel = listrectanglefour3RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectanglefour3RowModel>) {
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
      item: Listrectanglefour3RowModel
    ) {
    }
  }

  inner class RowListrectanglefour3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefour3Binding = RowListrectanglefour3Binding.bind(itemView)
  }
}
