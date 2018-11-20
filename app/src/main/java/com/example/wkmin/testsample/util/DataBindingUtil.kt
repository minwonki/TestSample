package com.example.wkmin.testsample.util

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import com.example.wkmin.testsample.adpter.FlexibleAdapter
import com.example.wkmin.testsample.adpter.data.BaseItem

class DataBindingUtil {
    companion object {
        @BindingAdapter("list_items")
        @JvmStatic
        fun setBindItems(view: RecyclerView, items: ArrayList<BaseItem>) {
            val adapter = view.adapter as? FlexibleAdapter ?: FlexibleAdapter().apply { view.adapter = this }
            adapter.items = items
            adapter.notifyDataSetChanged()
        }
    }
}