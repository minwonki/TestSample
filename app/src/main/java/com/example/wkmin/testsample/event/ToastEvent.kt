package com.example.wkmin.testsample.event

import android.app.Activity
import android.widget.Toast

class ToastEvent(private val msg: String) : EventBusInterface {

    override fun show(activity: Activity) {
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()
    }
}