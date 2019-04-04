package com.github.kubode.kapt.lib

import dagger.Module
import dagger.Provides

@Module
class LibJvmModule {
    @Provides
    fun provideString() = "Jvm"
}
