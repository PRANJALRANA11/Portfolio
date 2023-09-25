package com.pranjalranasapplication.app.modules.gallery.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.databinding.RowGalleryBinding
import com.pranjalranasapplication.app.modules.gallery.`data`.model.GalleryRowModel
import kotlin.Int
import kotlin.collections.List

class GalleryAdapter(
  var list: List<GalleryRowModel>
) : RecyclerView.Adapter<GalleryAdapter.RowGalleryVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGalleryVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gallery,parent,false)
    return RowGalleryVH(view)
  }

  override fun onBindViewHolder(holder: RowGalleryVH, position: Int) {
    val galleryRowModel = GalleryRowModel()
    // TODO uncomment following line after integration with data source
    // val galleryRowModel = list[position]
    holder.binding.galleryRowModel = galleryRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GalleryRowModel>) {
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
      item: GalleryRowModel
    ) {
    }
  }

  inner class RowGalleryVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGalleryBinding = RowGalleryBinding.bind(itemView)
  }
}
