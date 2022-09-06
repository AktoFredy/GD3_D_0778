package com.example.gd3_d_0778.entity

class Dosen(var name:String, var pengajar:String) {
    //companion object seperti static di java dan berikut adalah array untuk menyimpan data dummy dosen
    companion object{
        @JvmField
        var listOfDosen = arrayOf(
            Dosen("Fedelis Brian", "Pengajar Kelas A, B, dan D"),
            Dosen("Thomas Adi", "Pengajar Kelas C"),
        )
    }
}