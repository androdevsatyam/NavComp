package com.satyam.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


/**
 * Created by SATYAM on 10/03/23.
 * Associated with IOVRVF
 * Contact me on: satyamiovrvf@gmail.com
 */
class WelcomModelFactory(val counter: Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return WelcomeModel(counter) as T
    }

}