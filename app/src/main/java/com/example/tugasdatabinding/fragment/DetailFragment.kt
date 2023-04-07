package com.example.tugasdatabinding.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tugasdatabinding.DataBerita
import com.example.tugasdatabinding.R
import com.example.tugasdatabinding.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val judulBerita = arguments?.getString("JUDUL")
        val penulisBerita = arguments?.getString("PENULIS")
        val tanggalBerita = arguments?.getString("TANGGAL")
        val kategoriBerita = arguments?.getString("KATEGORI")
        val imageBerita = arguments?.getInt("IMAGE")
        val deskripsiBerita = arguments?.getString("DESKRIPSI")
//        val dataBerita = DataBerita(judulBerita.toString(), penulisBerita.toString(), tanggalBerita.toString(), kategoriBerita.toString(), imageBerita.toString().toInt(), deskripsiBerita.toString())

        val dataBerita = DataBerita(judulBerita.toString(), tanggalBerita.toString(), penulisBerita.toString(), kategoriBerita.toString(), imageBerita.toString().toInt(), deskripsiBerita.toString())

        binding.berita = dataBerita
    }

}