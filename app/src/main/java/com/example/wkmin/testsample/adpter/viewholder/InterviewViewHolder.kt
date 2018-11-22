package com.example.wkmin.testsample.adpter.viewholder

import android.view.View
import com.example.wkmin.testsample.adpter.data.InterviewCell
import com.example.wkmin.testsample.event.SnackBarEvent
import com.example.wkmin.testsample.util.RxEventBus

class InterviewViewHolder(itemView: View) : BaseViewHolder<InterviewCell>(itemView) {

    override fun onBindView(item: InterviewCell) {
        itemView.tag = item
    }

    override fun onItemClick() {
        val item = itemView.tag
        if (item is InterviewCell)
            RxEventBus.sendEvent(SnackBarEvent(item.interviewQuestion))
    }
}