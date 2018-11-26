package com.example.wkmin.testsample.view

import androidx.databinding.ObservableArrayList
import com.example.wkmin.testsample.adpter.data.BaseItem
import com.example.wkmin.testsample.adpter.data.BaseItemList
import com.example.wkmin.testsample.event.ToastEvent
import com.example.wkmin.testsample.network.APIInterface
import com.example.wkmin.testsample.util.RxEventBus
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainViewModel(private val service: APIInterface) : BaseViewModel() {

    val items = ObservableArrayList<BaseItem>()

    init {
        requestList()
    }

    private fun requestList() {
        service.requestList()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<BaseItemList>{
                override fun onSuccess(t: BaseItemList) {
                    items.addAll(t.items)
                    RxEventBus.sendEvent(ToastEvent("onSuccess:size:${items.size}"))
                }

                override fun onSubscribe(d: Disposable) {
                    RxEventBus.sendEvent(ToastEvent("onSubscribe"))
                }

                override fun onError(e: Throwable) {
                    RxEventBus.sendEvent(ToastEvent("onSubscribe"))
                }

            })

    }
}