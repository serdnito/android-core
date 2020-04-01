package com.serdnito.android.core.ui.widget.recyclerview

import androidx.recyclerview.widget.RecyclerView

open class CoreItemDecoration : RecyclerView.ItemDecoration() {

    protected fun isFirstItem(position: Int) = (position == 0)

    protected fun isLastItem(position: Int, count: Int) = (count > 0) && (position == count - 1)

    protected fun unknownPosition(position: Int) = (position == RecyclerView.NO_POSITION)

}