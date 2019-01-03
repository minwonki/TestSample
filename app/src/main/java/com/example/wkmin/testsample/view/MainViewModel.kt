package com.example.wkmin.testsample.view

import androidx.databinding.ObservableArrayList
import com.example.wkmin.testsample.adpter.data.BaseItem
import com.example.wkmin.testsample.adpter.data.BaseItemList
import com.example.wkmin.testsample.network.APIInterface
import com.example.wkmin.testsample.network.BaseSingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
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
            .subscribe(object : BaseSingleObserver<BaseItemList>(disposable){
                override fun onSuccess(t: BaseItemList) {
                    super.onSuccess(t)
                    items.addAll(t.items)
                }
            })
    }
}