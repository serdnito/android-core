package com.serdnito.android.core.error

import android.content.Context
import com.serdnito.android.core.R
import javax.inject.Inject

class AndroidErrorHandler @Inject constructor(
    private val context: Context
) : ErrorHandler {

    override fun convert(error: Throwable) =
        when (error.cause) {
            is Error.FeatureError -> error.message ?: context.getString(R.string.error_default)
            is Error.NetworkError -> context.getString(R.string.error_network)
            is Error.ServerError -> context.getString(R.string.error_server)
            else -> context.getString(R.string.error_default)
        }

}