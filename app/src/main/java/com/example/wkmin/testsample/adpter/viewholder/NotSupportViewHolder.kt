package com.example.wkmin.testsample.adpter.viewholder

import android.view.View
import com.example.wkmin.testsample.adpter.data.BaseItem

class NotSupportViewHolder(itemView: View) : BaseViewHolder<BaseItem>(itemView) {

    override fun onBindView(item: BaseItem) {
        println("NotSupportViewHolder")
    }

}