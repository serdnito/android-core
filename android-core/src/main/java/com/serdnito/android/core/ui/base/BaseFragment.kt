package com.serdnito.android.core.ui.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

@Suppress("MemberVisibilityCanBePrivate")
open class BaseFragment(
    @LayoutRes layoutResId: Int,
    private val redraw: Boolean
) : Fragment(layoutResId) {

    private var rootView: View? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        injectDependencies()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        if (redraw || rootView == null) {
            rootView = null
            super.onCreateView(inflater, container, savedInstanceState)
        } else {
            rootView
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        if (rootView == null) {
            rootView = view
            initUi()
        }
    }

    protected fun initUi() {
    }

    protected fun injectDependencies() {
    }

}