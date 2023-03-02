package com.foranj.farmtow.nhyjuujjuju.gtgtgtgt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.foranj.farmtow.R
import com.foranj.farmtow.databinding.FragmentGammaamamma2222222Binding
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random


class Gammaamamma2222222Fragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            val nnn = Random.nextInt(from = 1000, until = 5000)
            binding.gthyhyhyhy.text = "$nnn\nPoints!"

            binding.lllllllleeef.setOnClickListener {
                Toast.makeText(requireContext(), "Earn more points!", Toast.LENGTH_SHORT).show()

            }
            binding.riigghhtt.setOnClickListener {
                Toast.makeText(requireContext(), "Earn more points!", Toast.LENGTH_SHORT).show()

            }


            gtjgtjiogtjijigt()

        } catch (e: Exception) {
            vfvvf()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtjgtjiogtjijigt() {
        binding.btnRessttaart.setOnClickListener {
            gtjiogtjiogtjiotgjgt()
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

    private var fragmentGaaaameemem1111Binding: FragmentGammaamamma2222222Binding? = null
    private val binding
        get() = fragmentGaaaameemem1111Binding
            ?: throw RuntimeException("FragmentGammaamamma2222222Binding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaaameemem1111Binding =
            FragmentGammaamamma2222222Binding.inflate(inflater, container, false)
        return binding.root
    }


    private fun gtjiogtjiogtjiotgjgt() {
        findNavController().navigate(R.id.action_gammaamamma2222222Fragment_to_gaaamamamam1mm1m11Fragment)
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