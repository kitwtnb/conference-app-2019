package io.github.droidkaigi.confsched2019.di

import dagger.Module
import dagger.Provides
import io.github.droidkaigi.confsched2019.data.firestore.FireStore
import io.github.droidkaigi.confsched2019.data.repository.FireStoreComponent
import io.github.droidkaigi.confsched2019.ext.android.Dispatchers
import javax.inject.Singleton

@Module
object FireStoreComponentModule {
    @JvmStatic @Provides @Singleton fun provideRepository(): FireStore {
        return FireStoreComponent.builder()
            .coroutineContext(Dispatchers.IO)
            .build()
            .fireStore()
    }
}
