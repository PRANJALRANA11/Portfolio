package com.pranjalranasapplication.app.modules.viewticket.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowTicketBinding
import com.pranjalranasapplication.app.modules.viewticket.`data`.model.TicketRowModel
import kotlin.Int
import kotlin.collections.List

class ViewTicketAdapter(
  var list: List<TicketRowModel>
) : RecyclerView.Adapter<ViewTicketAdapter.RowTicketVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTicketVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_ticket,parent,false)
    return RowTicketVH(view)
  }

  override fun onBindViewHolder(holder: RowTicketVH, position: Int) {
    val ticketRowModel = TicketRowModel()
    // TODO uncomment following line after integration with data source
    // val ticketRowModel = list[position]
    holder.binding.ticketRowModel = ticketRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TicketRowModel>) {
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
      item: TicketRowModel
    ) {
    }
  }

  inner class RowTicketVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTicketBinding = RowTicketBinding.bind(itemView)
  }
}
