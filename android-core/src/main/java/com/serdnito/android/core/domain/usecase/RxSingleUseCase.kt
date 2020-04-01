package com.serdnito.android.core.domain.usecase

import com.serdnito.android.core.thread.RxExecutor
import io.reactivex.Single

abstract class RxSingleUseCase<I, O>(
    private val executor: RxExecutor
) : UseCase<I, Single<O>>() {

    operator fun invoke(input: I): Single<O> =
        build(input)
            .subscribeOn(executor.io)
            .observeOn(executor.main)

}