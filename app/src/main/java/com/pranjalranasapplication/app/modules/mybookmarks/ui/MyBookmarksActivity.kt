package com.pranjalranasapplication.app.modules.mybookmarks.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityMyBookmarksBinding
import com.pranjalranasapplication.app.modules.bookmarkremoval.ui.BookmarkRemovalBottomsheet
import com.pranjalranasapplication.app.modules.mybookmarks.`data`.model.BookmarksRowModel
import com.pranjalranasapplication.app.modules.mybookmarks.`data`.viewmodel.MyBookmarksVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyBookmarksActivity : BaseActivity<ActivityMyBookmarksBinding>(R.layout.activity_my_bookmarks)
    {
  private val viewModel: MyBookmarksVM by viewModels<MyBookmarksVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val myBookmarksAdapter =
    MyBookmarksAdapter(viewModel.myBookmarksList.value?:mutableListOf())
    binding.recyclerMyBookmarks.adapter = myBookmarksAdapter
    myBookmarksAdapter.setOnItemClickListener(
    object : MyBookmarksAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BookmarksRowModel) {
        onClickRecyclerMyBookmarks(view, position, item)
      }
    }
    )
    viewModel.myBookmarksList.observe(this) {
      myBookmarksAdapter.updateData(it)
    }
    binding.myBookmarksVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerMyBookmarks(
    view: View,
    position: Int,
    item: BookmarksRowModel
  ): Unit {
    when(view.id) {
      R.id.imageBookmark ->  {
        val destFragment = BookmarkRemovalBottomsheet.getInstance(null)
        destFragment.show(this.supportFragmentManager, BookmarkRemovalBottomsheet.TAG)
      }
    }
  }

  companion object {
    const val TAG: String = "MY_BOOKMARKS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyBookmarksActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
