package de.syntaxinstitut.fragmentnavigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import de.syntaxinstitut.fragmentnavigation.R
import de.syntaxinstitut.fragmentnavigation.databinding.FragmentHomeBinding
import de.syntaxinstitut.fragmentnavigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    var text = ""
    var zahl = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Auslesen der Argumente
        arguments?.let {
            text = it.getString("text")!!
            zahl = it.getInt("zahl")!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView2.text = "$text   $zahl"
    }

}