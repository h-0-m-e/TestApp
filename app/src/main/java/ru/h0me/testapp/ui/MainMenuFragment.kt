package ru.h0me.testapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.h0me.testapp.R
import ru.h0me.testapp.databinding.MainMenuFragmentBinding

class MainMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = MainMenuFragmentBinding.inflate(
            inflater,
            container,
            false
        )

        //выставляю значения тут, словно они пришли из вьюмодели.
        binding.balanceButton.text = "2346"
        binding.levelButton.text = "LEVEL 15"
        binding.unitCurrentValue.text = "213"
        binding.unitCurrentButton.text = "2400"
        binding.unitSpeedValue.text = "17"

        binding.shopButton.setOnClickListener {
            findNavController().navigate(R.id.action_mainMenuFragment_to_staticImageFragment)
        }

        return binding.root
    }
}
