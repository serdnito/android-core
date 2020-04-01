package com.serdnito.android.core.thread

import io.reactivex.Scheduler

interface RxExecutor {
    val io: Scheduler
    val main: Scheduler
}