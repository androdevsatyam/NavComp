package com.satyam.navcomp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.satyam.navcomp.R
import com.satyam.navcomp.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    var registerBinding: FragmentRegisterBinding? = null
    val binding get() = registerBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        registerBinding = FragmentRegisterBinding.inflate(inflater, container, false)

        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.go_notes)
        }

        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.go_login)
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        registerBinding = null
    }

}
