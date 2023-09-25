package com.pranjalranasapplication.app.modules.refundmethod.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowMethodBinding
import com.pranjalranasapplication.app.modules.refundmethod.`data`.model.MethodRowModel
import kotlin.Int
import kotlin.collections.List

class RefundMethodAdapter(
  var list: List<MethodRowModel>
) : RecyclerView.Adapter<RefundMethodAdapter.RowMethodVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMethodVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_method,parent,false)
    return RowMethodVH(view)
  }

  override fun onBindViewHolder(holder: RowMethodVH, position: Int) {
    val methodRowModel = MethodRowModel()
    // TODO uncomment following line after integration with data source
    // val methodRowModel = list[position]
    holder.binding.methodRowModel = methodRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MethodRowModel>) {
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
      item: MethodRowModel
    ) {
    }
  }

  inner class RowMethodVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMethodBinding = RowMethodBinding.bind(itemView)
  }
}
