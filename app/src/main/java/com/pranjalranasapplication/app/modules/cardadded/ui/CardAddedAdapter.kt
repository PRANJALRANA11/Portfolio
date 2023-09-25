package com.pranjalranasapplication.app.modules.cardadded.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowAddedBinding
import com.pranjalranasapplication.app.modules.cardadded.`data`.model.AddedRowModel
import kotlin.Int
import kotlin.collections.List

class CardAddedAdapter(
  var list: List<AddedRowModel>
) : RecyclerView.Adapter<CardAddedAdapter.RowAddedVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAddedVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_added,parent,false)
    return RowAddedVH(view)
  }

  override fun onBindViewHolder(holder: RowAddedVH, position: Int) {
    val addedRowModel = AddedRowModel()
    // TODO uncomment following line after integration with data source
    // val addedRowModel = list[position]
    holder.binding.addedRowModel = addedRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AddedRowModel>) {
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
      item: AddedRowModel
    ) {
    }
  }

  inner class RowAddedVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowAddedBinding = RowAddedBinding.bind(itemView)
  }
}
