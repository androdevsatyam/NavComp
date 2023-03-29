package com.satyam.hilt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.satyam.navcomp.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint //this annotate tells dagger that we require injection in this file
class ListFrag : Fragment() {

    @Inject
    lateinit var userReference:UserReference

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        userReference.saveUser()

        return inflater.inflate(R.layout.fragment_list, container, false)
    }

}