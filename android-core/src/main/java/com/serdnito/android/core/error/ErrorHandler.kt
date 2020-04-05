package com.serdnito.android.core.error

interface ErrorHandler {
    fun convert(error: Throwable): String
}