package com.serdnito.android.core.ui.mvp

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import com.serdnito.android.core.ui.base.BaseFragment

@Suppress("MemberVisibilityCanBePrivate")
open class MvpFragment(
    @LayoutRes layoutResId: Int,
    redraw: Boolean
) : BaseFragment(layoutResId, redraw) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initPresenter()
    }

    protected fun initPresenter() {
    }

}