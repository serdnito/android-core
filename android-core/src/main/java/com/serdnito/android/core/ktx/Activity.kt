package com.serdnito.android.core.ktx

import android.app.Activity
import android.view.WindowManager

fun Activity.setWindowNotTouchable() {
    window.addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
}

fun Activity.setWindowTouchable() {
    window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
}