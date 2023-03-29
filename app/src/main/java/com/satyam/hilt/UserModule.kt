package com.satyam.hilt

import androidx.fragment.app.Fragment
import androidx.navigation.Navigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

/**
 * Created by SATYAM on 09/03/23.
 * Associated with IOVRVF
 * Contact me on: satyamiovrvf@gmail.com
 */

@InstallIn(FragmentComponent::class)// define the scope of this module
@Module // this annotation is used in we have to inject any third party lib or class that we can't access directly
class UserModule {

    @Provides
    fun createUserRepository () : UserReference {
        return saveDB()
    }
}