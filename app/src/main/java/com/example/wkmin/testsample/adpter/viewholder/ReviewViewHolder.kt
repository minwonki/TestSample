package com.example.wkmin.testsample.adpter.viewholder

import android.view.View
import com.example.wkmin.testsample.adpter.data.ReviewCell
import com.example.wkmin.testsample.event.LogSentEvent
import com.example.wkmin.testsample.event.ToastEvent
import com.example.wkmin.testsample.util.RxEventBus

class ReviewViewHolder(itemView: View) : BaseViewHolder<ReviewCell>(itemView) {

    override fun onBindView(item: ReviewCell) {
        println("Review")
        itemView.tag = item
    }

    override fun onItemClick() {
        val item = itemView.tag
        if (item is ReviewCell) {
            RxEventBus.sendEvent(ToastEvent(item.cons))
            RxEventBus.sendEvent(LogSentEvent("test"))
        }
    }
}