package com.sulav.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class Fragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var button  = view?.findViewById<Button>(R.id.btn2)
        button?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragment2_to_fragment3)
        }

        var button2  = view?.findViewById<Button>(R.id.btn21)
        button2?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragment2_to_fragment4)
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2, container, false)
    }
}
