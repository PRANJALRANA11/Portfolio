package com.pranjalranasapplication.app.modules.mybookmarks.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowBookmarksBinding
import com.pranjalranasapplication.app.modules.mybookmarks.`data`.model.BookmarksRowModel
import kotlin.Int
import kotlin.collections.List

class MyBookmarksAdapter(
  var list: List<BookmarksRowModel>
) : RecyclerView.Adapter<MyBookmarksAdapter.RowBookmarksVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBookmarksVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_bookmarks,parent,false)
    return RowBookmarksVH(view)
  }

  override fun onBindViewHolder(holder: RowBookmarksVH, position: Int) {
    val bookmarksRowModel = BookmarksRowModel()
    // TODO uncomment following line after integration with data source
    // val bookmarksRowModel = list[position]
    holder.binding.bookmarksRowModel = bookmarksRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BookmarksRowModel>) {
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
      item: BookmarksRowModel
    ) {
    }
  }

  inner class RowBookmarksVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBookmarksBinding = RowBookmarksBinding.bind(itemView)
    init {
      binding.imageBookmark.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, BookmarksRowModel())
      }
    }
  }
}
