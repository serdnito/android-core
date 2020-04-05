package com.serdnito.android.core.ktx

import android.graphics.Point
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.core.widget.NestedScrollView

/**
 * [NestedScrollView]
 */
fun NestedScrollView.scrollToView(view: View) {
    val childOffset = Point()
    getDeepChildOffset(this, view.parent, view, childOffset)
    smoothScrollTo(0, childOffset.y)
}

private fun getDeepChildOffset(
    mainParent: ViewGroup,
    parent: ViewParent,
    child: View,
    accumulatedOffset: Point
) {
    val parentGroup = parent as ViewGroup
    accumulatedOffset.x += child.left
    accumulatedOffset.y += child.top
    if (parentGroup == mainParent) {
        return
    }
    getDeepChildOffset(mainParent, parentGroup.parent, parentGroup, accumulatedOffset)
}