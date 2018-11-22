package com.example.wkmin.testsample.event

import android.app.Activity
import android.view.View
import com.google.android.material.snackbar.Snackbar

class SnackBarEvent(private var msg: String) : EventBusInterface {

    override fun show(activity : Activity) {
        val v = activity.findViewById<View>(android.R.id.content)
        Snackbar.make(v, msg, Snackbar.LENGTH_SHORT).show()
    }
}