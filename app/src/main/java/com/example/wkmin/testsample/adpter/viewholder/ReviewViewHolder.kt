package com.example.wkmin.testsample.adpter.viewholder

import android.view.View
import com.example.wkmin.testsample.adpter.data.ReviewCell

class ReviewViewHolder(itemView: View) : BaseViewHolder<ReviewCell>(itemView) {

    override fun onBindView(item: ReviewCell) {
        println("CompanyViewHolder")
    }

}