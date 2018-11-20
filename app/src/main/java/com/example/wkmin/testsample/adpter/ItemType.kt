package com.example.wkmin.testsample.adpter

import com.example.wkmin.testsample.R
import com.example.wkmin.testsample.adpter.data.BaseItem
import com.example.wkmin.testsample.adpter.data.CompanyCell
import com.example.wkmin.testsample.adpter.data.InterviewCell
import com.example.wkmin.testsample.adpter.data.ReviewCell
import com.example.wkmin.testsample.adpter.viewholder.*

class ItemType {

    enum class Type(
        var dataJavaClass: Class<out BaseItem>,
        var vhJavaClass: Class<out BaseViewHolder<*>>,
        var vhXml: Int
    ) {
        CELL_TYPE_COMPANY(CompanyCell::class.java, CompanyViewHolder::class.java, R.layout.vh_company),
        CELL_TYPE_REVIEW(ReviewCell::class.java, ReviewViewHolder::class.java, R.layout.vh_review),
        CELL_TYPE_INTERVIEW(InterviewCell::class.java, InterviewViewHolder::class.java, R.layout.vh_interview),
        NOT_SUPPORT(BaseItem::class.java, NotSupportViewHolder::class.java, R.layout.vh_not_support)
    }

}