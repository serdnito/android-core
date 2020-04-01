package com.serdnito.android.core.domain.usecase

import com.serdnito.android.core.thread.RxExecutor
import io.reactivex.Completable

abstract class RxCompletableUseCase<in T>(
    private val executor: RxExecutor
) {

    abstract fun build(input: T): Completable

    operator fun invoke(input: T): Completable =
        build(input)
            .subscribeOn(executor.io)
            .observeOn(executor.main)

}