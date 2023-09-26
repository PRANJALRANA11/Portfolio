package com.pranjalranasapplication.app.modules.choosepaymentmethod.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListreplyBinding
import com.pranjalranasapplication.app.modules.choosepaymentmethod.`data`.model.ListreplyRowModel
import kotlin.Int
import kotlin.collections.List

class ListreplyAdapter(
  var list: List<ListreplyRowModel>
) : RecyclerView.Adapter<ListreplyAdapter.RowListreplyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListreplyVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listreply,parent,false)
    return RowListreplyVH(view)
  }

  override fun onBindViewHolder(holder: RowListreplyVH, position: Int) {
    val listreplyRowModel = ListreplyRowModel()
    // TODO uncomment following line after integration with data source
    // val listreplyRowModel = list[position]
    holder.binding.listreplyRowModel = listreplyRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListreplyRowModel>) {
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
      item: ListreplyRowModel
    ) {
    }
  }

  inner class RowListreplyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListreplyBinding = RowListreplyBinding.bind(itemView)
  }
}
