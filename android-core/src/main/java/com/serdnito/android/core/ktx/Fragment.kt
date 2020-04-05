package com.serdnito.android.core.ktx

import androidx.activity.addCallback
import androidx.fragment.app.Fragment

/**
 * [Fragment] extensions
 */
fun Fragment.addOnBackClickCallback(action: () -> Unit) {
    activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner) { action() }
}