package com.serdnito.android.core.domain.usecase

abstract class UseCase<in I, out O> {
    abstract fun build(input: I): O
}