package com.example.wkmin.testsample.event

import android.app.Activity
import androidx.appcompat.app.AlertDialog

class AlertDialogEvent(private val msg: String) : EventBusInterface {

    override fun show(activity: Activity) {
        val builder = AlertDialog.Builder(activity)
        builder.setMessage(msg).setTitle("Alert")
        builder.create().show()
    }
}