package com.serdnito.android.core.error

sealed class Error: Throwable() {

    class FeatureError(val text: String?) : Error()
    object NetworkError : Error()
    object ServerError : Error()

}