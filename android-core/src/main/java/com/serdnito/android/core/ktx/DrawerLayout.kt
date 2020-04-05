package com.serdnito.android.core.ktx

import android.view.View
import androidx.drawerlayout.widget.DrawerLayout

/**
 * [DrawerLayout] extensions
 */
fun DrawerLayout.onDrawerSlide(onClosed: () -> Unit, onOpened: () -> Unit) {
    addDrawerListener(object : DrawerLayout.DrawerListener {
        override fun onDrawerStateChanged(newState: Int) {
            // do nothing
        }

        override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
            // do nothing
        }

        override fun onDrawerClosed(drawerView: View) {
            onClosed()
        }

        override fun onDrawerOpened(drawerView: View) {
            onOpened()
        }
    })
}