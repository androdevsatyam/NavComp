package com.satyam.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

/**
 * Created by SATYAM on 09/03/23.
 * Associated with IOVRVF
 * Contact me on: satyamiovrvf@gmail.com
 */

@HiltAndroidApp //this annotate generate DAGGER CODE for us
class HiltApplication : Application() {

    override fun onCreate() {
        super.onCreate()

    }

}