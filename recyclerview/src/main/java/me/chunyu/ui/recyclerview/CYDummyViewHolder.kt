package me.chunyu.ui.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.dummy_recyclerview_item_row.view.*


/**
 * Created by huangpeng on 11/11/2017.
 */
class CYDummyViewHolder(private val v: View) : RecyclerView.ViewHolder(v) {
    fun updateWithMsg(msg: String) {
        v.tipView.text = msg
    }
}