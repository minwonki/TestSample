package com.example.wkmin.testsample.adpter.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class BaseViewHolder<ITEM>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun onBindView(item: ITEM)
}