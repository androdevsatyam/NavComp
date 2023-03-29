package com.satyam.navcomp.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.satyam.navcomp.R
import com.satyam.navcomp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    var loginBinding:FragmentLoginBinding?=null
    val binding get() = loginBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loginBinding=FragmentLoginBinding.inflate(inflater,container,false)


        binding.btnLogin.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_notes)
        }

        binding.btnSignUp.setOnClickListener{

        }

        return binding.root
    }

}
