package com.pranjalranasapplication.app.modules.forgotpassword.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListvolumeBinding
import com.pranjalranasapplication.app.modules.forgotpassword.`data`.model.ListvolumeRowModel
import kotlin.Int
import kotlin.collections.List

class ListvolumeAdapter(
  var list: List<ListvolumeRowModel>
) : RecyclerView.Adapter<ListvolumeAdapter.RowListvolumeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListvolumeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listvolume,parent,false)
    return RowListvolumeVH(view)
  }

  override fun onBindViewHolder(holder: RowListvolumeVH, position: Int) {
    val listvolumeRowModel = ListvolumeRowModel()
    // TODO uncomment following line after integration with data source
    // val listvolumeRowModel = list[position]
    holder.binding.listvolumeRowModel = listvolumeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListvolumeRowModel>) {
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
      item: ListvolumeRowModel
    ) {
    }
  }

  inner class RowListvolumeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListvolumeBinding = RowListvolumeBinding.bind(itemView)
  }
}
