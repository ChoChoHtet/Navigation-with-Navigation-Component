package com.android.navigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController



class FragmentStepOne : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val flowStepNumber=arguments?.get("flowStepNumber")
        //type safe args
        val safeArgs = FragmentStepOneArgs.fromBundle(arguments)
        val flowStepNumber = safeArgs.flowStepNumber
        Toast.makeText(context, flowStepNumber.toString(), Toast.LENGTH_LONG).show()
        return when (flowStepNumber) {
            2 -> inflater.inflate(R.layout.fragment_step_two, container, false)
            else -> inflater.inflate(R.layout.fragment_step__one, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.next_button).setOnClickListener {
            findNavController().navigate(R.id.action_next)
        }
    }


}
