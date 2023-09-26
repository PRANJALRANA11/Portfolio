package com.pranjalranasapplication.app.modules.review.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListellipseoneBinding
import com.pranjalranasapplication.app.modules.review.`data`.model.ListellipseoneRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipseoneAdapter(
  var list: List<ListellipseoneRowModel>
) : RecyclerView.Adapter<ListellipseoneAdapter.RowListellipseoneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipseoneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipseone,parent,false)
    return RowListellipseoneVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipseoneVH, position: Int) {
    val listellipseoneRowModel = ListellipseoneRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipseoneRowModel = list[position]
    holder.binding.listellipseoneRowModel = listellipseoneRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipseoneRowModel>) {
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
      item: ListellipseoneRowModel
    ) {
    }
  }

  inner class RowListellipseoneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipseoneBinding = RowListellipseoneBinding.bind(itemView)
    init {
      binding.btnFive.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListellipseoneRowModel())
      }
    }
  }
}
