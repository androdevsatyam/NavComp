package com.satyam.hilt

import android.util.Log
import javax.inject.Inject

/**
 * Created by SATYAM on 09/03/23.
 * Associated with IOVRVF
 * Contact me on: satyamiovrvf@gmail.com
 */

const val TAG="HiltExample"

interface  UserReference{
    fun saveUser()
}


class saveDB : UserReference{
    override fun saveUser() {
        Log.d(TAG, "saveUser DB")
    }

}

class saveFirebase  : UserReference{

    override fun saveUser(){
        Log.d(TAG, "saveUser Firebase")
    }
}
