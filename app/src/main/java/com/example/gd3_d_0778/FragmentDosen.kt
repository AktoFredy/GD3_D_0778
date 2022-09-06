package com.example.gd3_d_0778

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_d_0778.entity.Dosen

class FragmentDosen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Proses menghubungkan layout fragment_dosen.xml dengan freagment ini
        return inflater.inflate(R.layout.fragment_dosen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        val adapter : RVDosenAdapter = RVDosenAdapter(Dosen.listOfDosen)

        // menghubungkan rvdosen dengan recycler view yang ada pada layout
        val rvDosen : RecyclerView = view.findViewById(R.id.rv_dosen)

        //set layout manager dari recycler view
        rvDosen.layoutManager = layoutManager

        //tidak mengubah size recycler view jika terdapat item ditambahkan atau dikurangi
        rvDosen.setHasFixedSize(true)

        // set adapter dari recycler view.
        rvDosen.adapter = adapter
    }
}