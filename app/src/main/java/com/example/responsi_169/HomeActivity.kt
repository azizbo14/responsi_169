package com.example.responsi_169

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.responsi_169.adapter.gunung_adapter
import kotlinx.android.synthetic.main.actvity_home.*

class HomeActivity :  AppCompatActivity() {
        val nama_gunung = arrayOf(
            "Gunung Everest",
            "Gunung K2",
            "Gunung Kangchenjunga",
            "Gunung Lhotse 1",
            "Gunung Makalu 1",
            "Gunung Cho Oyu",
            "Gunung Dhaulagiri",
            "Gunung Manaslu 1",
            "Gunung Nanga Parbat",
            "Gunung Annapurna"
        )

        val deskripsi_gunung = arrayOf(
            "pegunungan Himalaya, Nepal/China, 29,035 ft / 8,850 m",
            "pegunungan Karakoram, Pakistan/China, 28,250 ft / 8,611 m",
            "pegunungan Himalaya, India/Nepal, 28,169 ft / 8,586 m",
            "pegunungan Himalaya, Nepal/China, 27,940 ft / 8,516 m",
            "pegunungan Himalaya, Nepal/China, 27,766 ft / 8,463 m",
            "pegunungan Himalaya, Nepal/China, 26,864 ft / 8,188 m",
            "pegunungan Himalaya, Nepal, 26,795 ft / 8,167 m",
            "pegunungan Himalaya, Nepal, 26,781 ft / 8,163 m",
            "pegunungan Himalaya, Pakistan, 26,660 ft / 8,125 m",
            "pegunungan Himalaya, Nepal, 26,545 ft / 8,091 m"
        )

        val idmage_gunung = arrayOf(
            R.drawable.everest,
            R.drawable.k2,
            R.drawable.kangchenjunga,
            R.drawable.lotse,
            R.drawable.makalu,
            R.drawable.chooyo,
            R.drawable.daulagiri,
            R.drawable.manaslu,
            R.drawable.nanga,
            R.drawable.annapurna
        )

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.actvity_home)

            val Gunung_adapter = gunung_adapter(this, nama_gunung, deskripsi_gunung, idmage_gunung)
            list_gunung.adapter = Gunung_adapter

            list_gunung.setOnItemClickListener() { adapterView, view, position, id ->
                val itemAtPos = adapterView.getItemAtPosition(position)
                val itemIdAtPos = adapterView.getItemIdAtPosition(position)
                Toast.makeText(
                    this, "${nama_gunung[position]} Adalah : ${deskripsi_gunung[position]}",
                    Toast.LENGTH_LONG
                ).show()

            }
        }
    }
