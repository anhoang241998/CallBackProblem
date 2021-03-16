package com.annguyenhoang.viewmodelproblem.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.annguyenhoang.viewmodelproblem.R
import com.annguyenhoang.viewmodelproblem.databinding.FragmentTwoBinding
import com.annguyenhoang.viewmodelproblem.utils.Bridge
import com.annguyenhoang.viewmodelproblem.utils.ICallBack

class TwoFragment : Fragment(R.layout.fragment_two), ICallBack {

    private var _binding: FragmentTwoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Bridge.iCallBack = this
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun callbackData(mess: String) {
        binding.tvResult.text = mess
    }

}