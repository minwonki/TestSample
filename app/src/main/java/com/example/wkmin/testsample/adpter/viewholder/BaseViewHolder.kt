package com.example.wkmin.testsample.adpter.viewholder

import androidx.recyclerview.widget.RecyclerView
import android.view.View

abstract class BaseViewHolder<ITEM>(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {

    init {
        itemView.setOnClickListener { onItemClick() }
    }

    abstract fun onItemClick()
    abstract fun onBindView(item: ITEM)
}