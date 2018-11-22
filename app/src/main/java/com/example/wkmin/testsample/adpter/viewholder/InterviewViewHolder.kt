package com.example.wkmin.testsample.adpter.viewholder

import android.view.View
import com.example.wkmin.testsample.adpter.data.InterviewCell
import com.example.wkmin.testsample.event.SnackBarEvent
import com.example.wkmin.testsample.util.RxEventBus

class InterviewViewHolder(itemView: View) : BaseViewHolder<InterviewCell>(itemView) {

    override fun onBindView(item: InterviewCell) {
        println("CompanyViewHolder")
    }

    override fun onItemClick() {
        RxEventBus.sendEvent(SnackBarEvent("InterView"))
    }
}