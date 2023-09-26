package com.pranjalranasapplication.app.modules.review.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListstar1Binding
import com.pranjalranasapplication.app.modules.review.`data`.model.Liststar1RowModel
import kotlin.Int
import kotlin.collections.List

class ListstarAdapter(
  var list: List<Liststar1RowModel>
) : RecyclerView.Adapter<ListstarAdapter.RowListstar1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListstar1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_liststar1,parent,false)
    return RowListstar1VH(view)
  }

  override fun onBindViewHolder(holder: RowListstar1VH, position: Int) {
    val liststar1RowModel = Liststar1RowModel()
    // TODO uncomment following line after integration with data source
    // val liststar1RowModel = list[position]
    holder.binding.liststar1RowModel = liststar1RowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Liststar1RowModel>) {
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
      item: Liststar1RowModel
    ) {
    }
  }

  inner class RowListstar1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListstar1Binding = RowListstar1Binding.bind(itemView)
  }
}
