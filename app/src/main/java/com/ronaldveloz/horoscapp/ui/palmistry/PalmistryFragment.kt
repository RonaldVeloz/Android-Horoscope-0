package com.ronaldveloz.horoscapp.ui.palmistry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ronaldveloz.horoscapp.R
import com.ronaldveloz.horoscapp.databinding.FragmentLuckBinding
import com.ronaldveloz.horoscapp.databinding.FragmentPalmistryBinding


class PalmistryFragment : Fragment() {
    private var _binding: FragmentPalmistryBinding? = null
    private val binding get() = _binding!!//Indicación de que no puede ser nulo
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPalmistryBinding.inflate(layoutInflater, container, false)
        return binding.root


    }

}