package com.pranjalranasapplication.app.modules.confirmpayment.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListcheckinBinding
import com.pranjalranasapplication.app.modules.confirmpayment.`data`.model.ListcheckinRowModel
import kotlin.Int
import kotlin.collections.List

class ListcheckinAdapter(
  var list: List<ListcheckinRowModel>
) : RecyclerView.Adapter<ListcheckinAdapter.RowListcheckinVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcheckinVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcheckin,parent,false)
    return RowListcheckinVH(view)
  }

  override fun onBindViewHolder(holder: RowListcheckinVH, position: Int) {
    val listcheckinRowModel = ListcheckinRowModel()
    // TODO uncomment following line after integration with data source
    // val listcheckinRowModel = list[position]
    holder.binding.listcheckinRowModel = listcheckinRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcheckinRowModel>) {
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
      item: ListcheckinRowModel
    ) {
    }
  }

  inner class RowListcheckinVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcheckinBinding = RowListcheckinBinding.bind(itemView)
  }
}
