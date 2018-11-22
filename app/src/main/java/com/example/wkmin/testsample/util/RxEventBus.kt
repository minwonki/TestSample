package com.example.wkmin.testsample.util

import com.example.wkmin.testsample.event.EventBusInterface
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

object RxEventBus {
    private val subject = PublishSubject.create<EventBusInterface>()

    fun sendEvent(msg: EventBusInterface) {
        subject.onNext(msg)
    }

    fun getEvent() : Observable<EventBusInterface> {
        return subject
    }
}