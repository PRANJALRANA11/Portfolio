package com.pranjalranasapplication.app.modules.bookingongoing.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListrectangleBinding
import com.pranjalranasapplication.app.modules.bookingongoing.`data`.model.ListrectangleRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangleAdapter(
  var list: List<ListrectangleRowModel>
) : RecyclerView.Adapter<ListrectangleAdapter.RowListrectangleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangleVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle,parent,false)
    return RowListrectangleVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangleVH, position: Int) {
    val listrectangleRowModel = ListrectangleRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangleRowModel = list[position]
    holder.binding.listrectangleRowModel = listrectangleRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangleRowModel>) {
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
      item: ListrectangleRowModel
    ) {
    }
  }

  inner class RowListrectangleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangleBinding = RowListrectangleBinding.bind(itemView)
    init {
      binding.btnPaid.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectangleRowModel())
      }
      binding.btnCancelBooking.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectangleRowModel())
      }
      binding.btnViewTicket.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectangleRowModel())
      }
    }
  }
}
