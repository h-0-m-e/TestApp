package ru.h0me.testapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.h0me.testapp.databinding.StaticImageFragmentBinding

class StaticImageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = StaticImageFragmentBinding.inflate(
            inflater,
            container,
            false
        )

        binding.backButton.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }
}
