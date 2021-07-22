package com.chinenye.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController
import com.chinenye.fragment.databinding.FragmentABinding

class AFragment : Fragment() {
    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentABinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.moveBtn.setOnClickListener {
            AFragmentDirections.actionAFragmentToBFragment(id:"kj4bb")
            findNavController().navigate(R.id.action_AFragment_to_BFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}