package me.chunyu.ui.recyclerview

/**
 * Created by huangpeng on 11/11/2017.
 */
interface CYItemModel {
    fun getViewHolderCreator() : CYViewHolderCreator? {
        return null
    }
}
