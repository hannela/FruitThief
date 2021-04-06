package edu.mills.fruitthief

import android.app.Application
import timber.log.Timber

class FruitThiefApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Timber logging
        Timber.plant(Timber.DebugTree())
    }
}