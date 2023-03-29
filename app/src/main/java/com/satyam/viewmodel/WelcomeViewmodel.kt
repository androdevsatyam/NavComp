package com.satyam.viewmodel

import android.R.attr.*
import android.annotation.TargetApi
import android.content.DialogInterface
import android.hardware.biometrics.BiometricPrompt
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.satyam.navcomp.R


class WelcomeViewmodel : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var button: Button
    lateinit var welcomeViewModel: WelcomeModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_viewmodel)

        displayBiometricPrompt()
//        welcomeViewModel = ViewModelProvider(this).get(WelcomeModel::class.java)
//        ViewModel Factory for start predifined value or point
        welcomeViewModel = ViewModelProvider(this,WelcomModelFactory(10)).get(WelcomeModel::class.java)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        textView.text = welcomeViewModel.count.toString()

        button.setOnClickListener({
            welcomeViewModel.increament()
            textView.text = welcomeViewModel.count.toString()
        })

    }

    @TargetApi(Build.VERSION_CODES.P)
    private fun displayBiometricPrompt(/*biometricCallback: BiometricPrompt.AuthenticationCallback*/) {
        BiometricPrompt.Builder(this@WelcomeViewmodel)
            .setTitle("title")
            .setSubtitle("subtitle")
            .setDescription("description")
            .setNegativeButton(
                "negativeButtonText", getMainExecutor(),
                DialogInterface.OnClickListener { dialogInterface, i -> Toast.makeText(this,"click",Toast.LENGTH_SHORT).show() })
            .build()
    }
}

