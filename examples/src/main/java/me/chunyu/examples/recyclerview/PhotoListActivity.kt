package me.chunyu.examples.recyclerview

import android.os.Bundle
import me.chunyu.examples.common.GridListActivity
import me.chunyu.ui.recyclerview.CYItemModel

class PhotoListActivity : GridListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var photosList = ArrayList<CYItemModel>()
        photosList.add(CYPhotoItem(CYPhoto()))
        photosList.add(CYPhotoItem(CYPhoto()))
        adapter.addItems(photosList)

        setRecyclerViewItemTouchListener()
    }
}
