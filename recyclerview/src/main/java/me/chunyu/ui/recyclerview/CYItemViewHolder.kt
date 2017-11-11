package me.chunyu.ui.recyclerview

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.ViewGroup
import me.chunyu.ui.utils.inflate
import kotlin.reflect.KClass
import kotlin.reflect.KFunction

/**
 * Created by huangpeng on 11/11/2017.
 */
interface CYItemViewHolder {
    fun shouldUpdate(item: Any) : Boolean

    class Creator<T: RecyclerView.ViewHolder>(holderClass: KClass<T>, layout: Int, viewType: Int) : CYViewHolderCreator {
        override val layout = layout
        override val viewType = viewType

        private val holderClass = holderClass

        constructor(holderClass: KClass<T>, layout: Int) : this(holderClass, layout, layout)

        // ViewHolder subclass is required to have the first constructor the same signature as RecyclerView.ViewHolder constructor
        override fun create(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val inflatedView = parent.inflate(layout, false)

            val c = holderClass.constructors.first()

            return c.call(inflatedView)
        }
    }
}