package com.pranjalranasapplication.app.modules.recentlybooked.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListrectanglefour2Binding
import com.pranjalranasapplication.app.modules.recentlybooked.`data`.model.Listrectanglefour2RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefourAdapter(
  var list: List<Listrectanglefour2RowModel>
) : RecyclerView.Adapter<ListrectanglefourAdapter.RowListrectanglefour2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefour2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefour2,parent,false)
    return RowListrectanglefour2VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefour2VH, position: Int) {
    val listrectanglefour2RowModel = Listrectanglefour2RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefour2RowModel = list[position]
    holder.binding.listrectanglefour2RowModel = listrectanglefour2RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectanglefour2RowModel>) {
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
      item: Listrectanglefour2RowModel
    ) {
    }
  }

  inner class RowListrectanglefour2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefour2Binding = RowListrectanglefour2Binding.bind(itemView)
  }
}
