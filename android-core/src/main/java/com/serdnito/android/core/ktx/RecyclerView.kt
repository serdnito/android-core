package com.serdnito.android.core.ktx

import androidx.recyclerview.widget.RecyclerView

/**
 * [RecyclerView] extensions
 */
fun RecyclerView.ItemDecoration.attachTo(recyclerView: RecyclerView) {
    recyclerView.addItemDecoration(this)
}