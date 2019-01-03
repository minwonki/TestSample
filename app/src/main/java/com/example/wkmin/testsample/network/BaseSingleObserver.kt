package com.example.wkmin.testsample.network

import com.example.wkmin.testsample.event.ToastEvent
import com.example.wkmin.testsample.util.RxEventBus
import io.reactivex.SingleObserver
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BaseSingleObserver<T>(private val disposable: CompositeDisposable) : SingleObserver<T> {

    override fun onSuccess(t: T) {
        RxEventBus.sendEvent(ToastEvent("onSuccess"))
    }

    override fun onSubscribe(d: Disposable) {
        RxEventBus.sendEvent(ToastEvent("onSubscribe"))
        disposable.add(d)
    }

    override fun onError(e: Throwable) {
        RxEventBus.sendEvent(ToastEvent("onError:${e.message}"))
    }

}