package com.annguyenhoang.viewmodelproblem.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.annguyenhoang.viewmodelproblem.R
import com.annguyenhoang.viewmodelproblem.databinding.FragmentThreeBinding
import com.annguyenhoang.viewmodelproblem.utils.Bridge

class ThreeFragment : Fragment(R.layout.fragment_three) {

    private var _binding: FragmentThreeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThreeBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSetValue.setOnClickListener {
            Bridge.iCallBack?.callbackData("Hello World")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}