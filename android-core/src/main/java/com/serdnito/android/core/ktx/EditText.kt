package com.serdnito.android.core.ktx

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView

/**
 * [EditText] extensions
 */
fun EditText.onRequestFocus(action: EditText.() -> Unit) {
    onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
        if (hasFocus) {
            (view as? EditText)?.apply { action() }
        }
    }
}

fun EditText.onSearchClick(action: (String) -> Unit) {
    setOnEditorActionListener(TextView.OnEditorActionListener { _, actionId, _ ->
        if (actionId == EditorInfo.IME_ACTION_SEARCH) {
            action(text?.toString() ?: "")
            return@OnEditorActionListener true
        }
        false
    })
}

fun EditText.onTextChanged(action: (String) -> Unit) {
    addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            // do nothing
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            // do nothing
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            s?.let { action(it.toString()) }
        }
    })
}