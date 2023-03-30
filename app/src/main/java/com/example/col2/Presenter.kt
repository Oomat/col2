package com.example.col2

import android.graphics.Color

class Presenter {
    var model = CounterModel()
    lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.changeCount(model.count)
        if (model.count == 10) {
            view.showToast()
        }
        if (model.count == 15) {
            view.color(Color.GREEN)
        }
    }

    fun decrement() {
        model.decrement()
        view.changeCount(model.count)
        if (model.count == 10) {
            view.showToast()
        }
        if (model.count != 15) {
            view.color(Color.BLACK)
        }
    }

    fun attachView(view: CounterView){
       this.view = view
    }
}