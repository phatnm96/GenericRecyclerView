package com.nmp.genericrecyclerview.demo

import android.content.Context
import android.view.ViewGroup
import com.nmp.genericrecyclerview.R
import com.nmp.genericrecyclerview.databinding.ItemContactBinding
import com.nmp.library.GenericRecyclerView
import com.nmp.library.OnRecyclerItemClickListener

class ContactAdapter(context: Context) :
    GenericRecyclerView<Data, OnRecyclerItemClickListener, ContactViewHolder, ItemContactBinding>(
        context
    ) {

    override fun getLayout(): Int {
        return R.layout.item_contact
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        return ContactViewHolder(inflate(parent) as ItemContactBinding)
    }

}