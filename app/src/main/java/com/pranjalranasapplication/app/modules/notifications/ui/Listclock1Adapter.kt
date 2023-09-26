package com.pranjalranasapplication.app.modules.notifications.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListclock1Binding
import com.pranjalranasapplication.app.modules.notifications.`data`.model.Listclock1RowModel
import kotlin.Int
import kotlin.collections.List

class Listclock1Adapter(
  var list: List<Listclock1RowModel>
) : RecyclerView.Adapter<Listclock1Adapter.RowListclock1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListclock1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listclock1,parent,false)
    return RowListclock1VH(view)
  }

  override fun onBindViewHolder(holder: RowListclock1VH, position: Int) {
    val listclock1RowModel = Listclock1RowModel()
    // TODO uncomment following line after integration with data source
    // val listclock1RowModel = list[position]
    holder.binding.listclock1RowModel = listclock1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listclock1RowModel>) {
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
      item: Listclock1RowModel
    ) {
    }
  }

  inner class RowListclock1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListclock1Binding = RowListclock1Binding.bind(itemView)
  }
}
