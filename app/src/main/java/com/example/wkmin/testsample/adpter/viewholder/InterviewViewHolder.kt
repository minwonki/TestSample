package com.example.wkmin.testsample.adpter.viewholder

import android.view.View
import com.example.wkmin.testsample.adpter.data.InterviewCell

class InterviewViewHolder(itemView: View) : BaseViewHolder<InterviewCell>(itemView) {

    override fun onBindView(item: InterviewCell) {
        println("CompanyViewHolder")
    }

}