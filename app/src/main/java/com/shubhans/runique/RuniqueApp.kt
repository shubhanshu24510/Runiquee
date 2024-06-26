package com.shubhans.runique

import android.app.Application
import com.shubhans.auth.data.di.authDataModule
import com.shubhans.auth.presentation.AuthViewModelModule
import com.shubhans.auth.presentation.di.authViewModuleModule
import com.shubhans.core.data.di.coreDataModule
import com.shubhans.run.location.di.locationModule
import com.shubhans.run.presentation.di.runPresentationModule
import com.shubhans.runique.di.appModule
import io.ktor.http.ContentType
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueApp : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            modules(
                authDataModule,
                authViewModuleModule,
                appModule,
                coreDataModule,
                runPresentationModule,
                locationModule
            )
        }
    }
}
