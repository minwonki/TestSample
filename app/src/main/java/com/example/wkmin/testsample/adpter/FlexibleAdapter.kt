package com.example.wkmin.testsample.adpter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wkmin.testsample.adpter.data.BaseItem
import com.example.wkmin.testsample.adpter.viewholder.BaseViewHolder

class FlexibleAdapter : androidx.recyclerview.widget.RecyclerView.Adapter<BaseViewHolder<*>>() {

    var items = ArrayList<BaseItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        val type = ItemType.Type.values()[viewType]
        val itemView = LayoutInflater.from(parent.context).inflate(type.vhXml, parent,false)
        return type.vhJavaClass.getConstructor(View::class.java).newInstance(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        @Suppress("UNCHECKED_CAST")
        (holder as BaseViewHolder<Any>).onBindView(items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return if (items.isEmpty()) -1 else items[position].type.ordinal
    }
}