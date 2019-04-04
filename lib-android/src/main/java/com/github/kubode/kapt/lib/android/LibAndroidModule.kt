package com.github.kubode.kapt.lib.android

import dagger.Module
import dagger.Provides

@Module
class LibAndroidModule {
    @Provides
    fun provideInt() = 1
}
