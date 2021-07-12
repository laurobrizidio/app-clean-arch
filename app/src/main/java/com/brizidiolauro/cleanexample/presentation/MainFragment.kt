package com.brizidiolauro.cleanexample.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.brizidiolauro.cleanexample.R
import com.brizidiolauro.cleanexample.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var bind: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentMainBinding.inflate(layoutInflater).let {
            bind = it
            it.root
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.appModule.text = "App Module"

        bind.buttonChange.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToHomeFragment())
        }
    }
}