package com.pranjalranasapplication.app.modules.searchfilter.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowListcountryBinding
import com.pranjalranasapplication.app.modules.searchfilter.`data`.model.ListcountryRowModel
import kotlin.Int
import kotlin.collections.List

class ListcountryAdapter(
  var list: List<ListcountryRowModel>
) : RecyclerView.Adapter<ListcountryAdapter.RowListcountryVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcountryVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcountry,parent,false)
    return RowListcountryVH(view)
  }

  override fun onBindViewHolder(holder: RowListcountryVH, position: Int) {
    val listcountryRowModel = ListcountryRowModel()
    // TODO uncomment following line after integration with data source
    // val listcountryRowModel = list[position]
    holder.binding.listcountryRowModel = listcountryRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcountryRowModel>) {
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
      item: ListcountryRowModel
    ) {
    }
  }

  inner class RowListcountryVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcountryBinding = RowListcountryBinding.bind(itemView)
  }
}
