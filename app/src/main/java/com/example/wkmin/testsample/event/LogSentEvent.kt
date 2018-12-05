package com.example.wkmin.testsample.event

import android.app.Activity

class LogSentEvent(private val msg: String) : EventBusInterface {

    override fun show(activity: Activity) {
        println("show LogSentEvent($msg)")
    }
}