package com.example.wkmin.testsample.adpter.viewholder

import android.view.View
import com.example.wkmin.testsample.adpter.data.CompanyCell
import com.example.wkmin.testsample.event.ToastEvent
import com.example.wkmin.testsample.util.RxEventBus

class CompanyViewHolder(itemView: View) : BaseViewHolder<CompanyCell>(itemView) {

    override fun onBindView(item: CompanyCell) {
        println("CompanyViewHolder")
    }

    override fun onItemClick() {
        RxEventBus.sendEvent(ToastEvent("Company"))
    }
}