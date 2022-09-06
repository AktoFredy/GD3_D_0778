package com.example.gd3_d_0778

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_d_0778.entity.Mahasiswa

class FragmentMahasiswa : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Proses menghubungkan layout fragment_mahasiswa.xml dengan fragment ini
        return inflater.inflate(R.layout.fragment_mahasiswa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        val adapter : RVMahasiswaAdapter = RVMahasiswaAdapter(Mahasiswa.listOfMahasiswa)

        //menghubungkan rvMahasiswa dengan recycler view yang ada pada layout
        val rvMahasiswa : RecyclerView = view.findViewById(R.id.rv_mahasiswa)

        // set layout manager dari recycler view
        rvMahasiswa.layoutManager = layoutManager

        // tidak mengubah size Recycler view jika terdapat item ditambahkan atau dikurankan
        rvMahasiswa.setHasFixedSize(true)

        //set adapter dari recycle view.
        rvMahasiswa.adapter = adapter
    }
}