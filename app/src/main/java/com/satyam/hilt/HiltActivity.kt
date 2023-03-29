package com.satyam.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.satyam.navcomp.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint //this annotate require to inject dagger in Activity or Fragment everywhere
class HiltActivity : AppCompatActivity() {

//    @Inject
//    lateinit var userReference:UserReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt)

//        userReference.saveUser()

    }
}