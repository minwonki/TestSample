package com.example.wkmin.testsample.event

import android.app.Activity
import android.content.Intent

class ShowActivityEvent(private val zClass: Class<*>) : EventBusInterface {

    override fun show(activity: Activity) {
        val intent = Intent(activity, zClass)
        activity.startActivity(intent)
    }
}