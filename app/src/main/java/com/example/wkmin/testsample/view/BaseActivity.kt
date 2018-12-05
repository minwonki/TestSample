package com.example.wkmin.testsample.view

import android.os.Bundle
import com.example.wkmin.testsample.event.AlertDialogEvent
import com.example.wkmin.testsample.event.EventBusInterface
import com.example.wkmin.testsample.event.SnackBarEvent
import com.example.wkmin.testsample.event.ToastEvent
import com.example.wkmin.testsample.util.RxEventBus
import com.trello.rxlifecycle3.components.support.RxAppCompatActivity
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

abstract class BaseActivity : RxAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        eventObserve()
    }

    private fun eventObserve() {
        RxEventBus.getEvent()
            .compose(bindToLifecycle())
            .subscribe(object : Observer<EventBusInterface> {
                override fun onComplete() {
                    println("onComplete")
                }

                override fun onSubscribe(d: Disposable) {
                    println("Base onSubscribe")
                }

                override fun onNext(t: EventBusInterface) {
                    println("Base onNext:$t")

                    when (t) {
                        is ToastEvent -> t.show(this@BaseActivity)
                        is SnackBarEvent -> t.show(this@BaseActivity)
                        is AlertDialogEvent -> t.show(this@BaseActivity)
                        else -> t.show(this@BaseActivity)
                    }

                }

                override fun onError(e: Throwable) {
                    println("onError:$e")
                }
            })
    }
}