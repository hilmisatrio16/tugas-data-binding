package com.example.tugasdatabinding.adapter


import android.content.ClipData
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasdatabinding.DataBerita
import com.example.tugasdatabinding.OnClickListener
import com.example.tugasdatabinding.R
import com.example.tugasdatabinding.databinding.ItemListBeritaBinding

class BeritaAdapter(private val context: Context, private var listBerita : ArrayList<DataBerita>) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {


    class ViewHolder(var binding: ItemListBeritaBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindBerita(itemData : DataBerita){
            binding.berita = itemData

            binding.root.setOnClickListener {
                val bundleDataBerita = Bundle().apply {
                    putString("JUDUL", itemData.judulBerita)
                    putString("TANGGAL", itemData.tanggalBerita)
                    putString("PENULIS", itemData.penulisBerita)
                    putString("KATEGORI", itemData.kategoriBerita)
                    putInt("IMAGE", itemData.imgBerita)
                    putString("DESKRIPSI", itemData.deskripsiBerita)
                }
                Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_detailFragment, bundleDataBerita)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaAdapter.ViewHolder {
        val view = ItemListBeritaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BeritaAdapter.ViewHolder, position: Int) {
        holder.bindBerita(listBerita[position])

//        holder.binding.root.setOnClickListener {
//            Toast.makeText(context, "hayo", Toast.LENGTH_SHORT).show()
//        }
    }

    override fun getItemCount(): Int {
        return listBerita.size
    }
}