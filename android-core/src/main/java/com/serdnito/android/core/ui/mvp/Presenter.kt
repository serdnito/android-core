package com.serdnito.android.core.ui.mvp

abstract class Presenter<T : View> {

    var view: T? = null

}