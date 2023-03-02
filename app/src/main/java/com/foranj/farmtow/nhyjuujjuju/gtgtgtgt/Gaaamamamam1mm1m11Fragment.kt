package com.foranj.farmtow.nhyjuujjuju.gtgtgtgt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.foranj.farmtow.R
import com.foranj.farmtow.databinding.FragmentGaaamamamam1mm1m11Binding
import com.google.android.material.snackbar.Snackbar


class Gaaamamamam1mm1m11Fragment : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            jrfrifhrrf()
            gjigtihgtuhugtigt()

        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun gjigtihgtuhugtigt() {
        jgtjoigtoigtiigt()
        rgjtjigtiogtigt()
        gjttgjgtjigt()
        hykohkykky()
    }

    private fun hykohkykky() {
        binding.fiiive.setOnClickListener {
            gtgthigtiugtuh()
        }
    }

    private fun gjttgjgtjigt() {
        binding.tvo.setOnClickListener {
            Toast.makeText(requireContext(), "Empty, no bonus", Toast.LENGTH_SHORT).show()
        }
    }

    private fun rgjtjigtiogtigt() {
        binding.four.setOnClickListener {
            Toast.makeText(requireContext(), "Empty, no bonus", Toast.LENGTH_SHORT).show()
        }
    }

    private fun jgtjoigtoigtiigt() {
        binding.three.setOnClickListener {
            Toast.makeText(requireContext(), "Empty, no bonus", Toast.LENGTH_SHORT).show()
        }
    }

    private fun jrfrifhrrf() {
        binding.one.setOnClickListener {
            Toast.makeText(requireContext(), "Empty, no bonus", Toast.LENGTH_SHORT).show()
        }
    }

    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentGaaaameemem1111Binding: FragmentGaaamamamam1mm1m11Binding? = null
    private val binding
        get() = fragmentGaaaameemem1111Binding
            ?: throw RuntimeException("FragmentGaaamamamam1mm1m11Binding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaaameemem1111Binding =
            FragmentGaaamamamam1mm1m11Binding.inflate(inflater, container, false)
        return binding.root
    }

    private fun gtgthigtiugtuh() {
        findNavController().navigate(R.id.action_gaaamamamam1mm1m11Fragment_to_gammaamamma2222222Fragment)
    }

    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGaaaameemem1111Binding = null
        super.onDestroy()
    }
}