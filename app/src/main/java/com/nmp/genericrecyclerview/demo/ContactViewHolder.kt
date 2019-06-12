package com.nmp.genericrecyclerview.demo

import com.nmp.genericrecyclerview.databinding.ItemContactBinding
import com.nmp.library.GenericViewHolder
import com.nmp.library.OnRecyclerItemClickListener

class ContactViewHolder(binding: ItemContactBinding) :
    GenericViewHolder<Data, OnRecyclerItemClickListener>(binding.root) {

    override fun onBind(item: Data) {
        item.let { binding.item = it }
    }

    var binding: ItemContactBinding

    init {
        this.binding = binding
    }
}