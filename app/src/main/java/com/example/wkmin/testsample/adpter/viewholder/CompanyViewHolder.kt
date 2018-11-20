package com.example.wkmin.testsample.adpter.viewholder

import android.view.View
import com.example.wkmin.testsample.adpter.data.CompanyCell

class CompanyViewHolder(itemView: View) : BaseViewHolder<CompanyCell>(itemView) {

    override fun onBindView(item: CompanyCell) {
        println("CompanyViewHolder")
    }

}