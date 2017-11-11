package me.chunyu.examples.recyclerview

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_photo_list.*
import me.chunyu.examples.R
import me.chunyu.examples.common.GridListActivity
import me.chunyu.ui.recyclerview.CYItemModel

class PhotoListActivity : GridListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var photosList = ArrayList<CYItemModel>()
        photosList.add(CYPhotoItem(CYPhoto()))
        photosList.add(CYPhotoItem(CYPhoto()))
        adapter.addItems(photosList)

        setupEvents()
    }

    override fun setContentView(layoutResID: Int) {
        super.setContentView(R.layout.activity_photo_list)
    }

    private fun setupEvents() {
        setRecyclerViewItemTouchListener()

        fab.setOnClickListener {
            addPhoto()
        }
    }

    private fun addPhoto() {
        //adapter.addItem(CYPhotoItem(CYPhoto()))
        adapter.add(CYPhotoItem(CYPhoto()), 0)
        adapter.notifyItemInserted(0)
    }
}
