package com.example.wkmin.testsample.adpter.viewholder

import android.view.View
import com.example.wkmin.testsample.adpter.data.BaseItem
import com.example.wkmin.testsample.event.AlertDialogEvent
import com.example.wkmin.testsample.util.RxEventBus

class NotSupportViewHolder(itemView: View) : BaseViewHolder<BaseItem>(itemView) {

    override fun onBindView(item: BaseItem) {
        itemView.tag = item
    }

    override fun onItemClick() {
        val item = itemView.tag
        if (item is BaseItem)
            RxEventBus.sendEvent(AlertDialogEvent(item.type.name))
    }
}