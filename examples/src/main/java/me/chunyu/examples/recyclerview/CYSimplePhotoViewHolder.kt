package me.chunyu.examples.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recyclerview_simple_photo_item.view.*
import me.chunyu.examples.R
import me.chunyu.ui.recyclerview.CYItemModel
import me.chunyu.ui.recyclerview.CYItemViewHolder
import me.chunyu.ui.recyclerview.CYViewHolderCreator

class CYSimplePhotoItem(photo: CYPhoto) : CYItemModel {
    val photo = photo
    override fun getViewHolderCreator(): CYViewHolderCreator? {
        return CYSimplePhotoViewHolder.creator
    }
}

/**
 * Created by huangpeng on 11/11/2017.
 */
class CYSimplePhotoViewHolder(v: View) : RecyclerView.ViewHolder(v), me.chunyu.ui.recyclerview.CYItemViewHolder {
    override fun shouldUpdate(item: Any): Boolean {
        if (item !is CYSimplePhotoItem) return false

        Picasso.with(itemView.context).load(item.photo.url).into(itemView.itemImage)

        return true
    }

    companion object {
        val creator = CYItemViewHolder.Creator(CYSimplePhotoViewHolder::class, R.layout.recyclerview_simple_photo_item)
    }
}