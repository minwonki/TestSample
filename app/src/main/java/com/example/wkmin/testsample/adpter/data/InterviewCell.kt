package com.example.wkmin.testsample.adpter.data

import com.google.gson.annotations.SerializedName

class InterviewCell(
    @SerializedName("interview_question") var interviewQuestion: String
) : BaseItem()