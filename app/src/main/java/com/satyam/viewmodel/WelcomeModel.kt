package com.satyam.viewmodel

import androidx.lifecycle.ViewModel

/**
 * Created by SATYAM on 10/03/23.
 * Associated with IOVRVF
 * Contact me on: satyamiovrvf@gmail.com
 */

class WelcomeModel(val counter:Int ) : ViewModel() {
    var count: Int = counter;

    fun increament() {
        count++
    }
}