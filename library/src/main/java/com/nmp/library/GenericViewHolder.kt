package com.nmp.library

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class GenericViewHolder<T, L : BaseRecyclerListener>(itemView: View) : RecyclerView.ViewHolder(itemView),
    View.OnClickListener {

    protected lateinit var listener: OnRecyclerItemClickListener

    override fun onClick(v: View) {
        listener.onItemClicked(v, adapterPosition)
    }

    init {
        itemView.setOnClickListener(this)
    }

    /**
     * Bind data to the item and set listener if needed.
     *
     * @param item object, associated with the item.
     */
    abstract fun onBind(item: T)

    /**
     * @param listener listener a listener [BaseRecyclerListener] which has to b set at the item (if not `null`).
     */
    fun onListener(listener: L) {
        this.listener = listener as OnRecyclerItemClickListener
    }
}