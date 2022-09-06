package com.example.gd3_d_0778

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //fragment yang pertama kali terlihat adalah fragment mahasiswa
        changeFragment(FragmentMahasiswa())
    }

    //method untuk mengubah fragment
    fun changeFragment(fragment: Fragment?) {
        if(fragment != null){
            getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.layout_fragment, fragment)
                .commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Disini kita menghubungkan menu yang telah kita buat dengan activity ini
        val menuInflater = MenuInflater(this)
        menuInflater.inflate(R.menu.home_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_mahasiswa){
            // jika menu yang dipilih adalah mahasiswa maka ganti fragmentnya dengan FragmentMahasiswa
            changeFragment(FragmentMahasiswa())
        }else if(item.itemId == R.id.menu_dosen){
            // Jika menu yang dipilih adalah Dosen maka ganti fragmentnya dengan FragmentDosen
            changeFragment(FragmentDosen())
        }else{
            // jika menu yang dipilih adalah menu exit maka tampilkan sebuah dialog
            val builder: AlertDialog.Builder = AlertDialog.Builder(this@HomeActivity)
            builder.setMessage("are you sure want to exit?")
                .setPositiveButton("Yes", object : DialogInterface.OnClickListener{
                    override fun onClick(dialogInterface: DialogInterface, i: Int) {
                        // keluar dari aplikasi
                        finishAndRemoveTask()
                    }
                })
                .show()
        }
        return super.onOptionsItemSelected(item)
    }
}