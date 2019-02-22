package com.android.navigation

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions


class FragmentMain : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //changing navigation transition
        val options= navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }
        //navigate to a destination
        val button=view.findViewById<Button>(R.id.navigate_destination_btn)
        button?.setOnClickListener {
            findNavController().navigate(R.id.fragmentStepOne,null,options)
            //Navigation.createNavigateOnClickListener(R.id.fragmentStepOne,null)
        }


    }


}
