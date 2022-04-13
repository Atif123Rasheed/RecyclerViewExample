package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var rvText: RecyclerView
    lateinit var adapter: RecyclerViewAdapter
    lateinit var celeberityArrayList: ArrayList<Celeberity>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvText = findViewById(R.id.rv_list_items)
        rvText.layoutManager = LinearLayoutManager(this)
        celeberityArrayList = ArrayList(6)


        celeberityArrayList.add(
            Celeberity(
                "Bruce Lee",
                "Born: November 27, 1940 in San Francisco, California, USA",
                R.drawable.brucelee
            )
        )
        celeberityArrayList.add(
            Celeberity(
                "Charlie Chaplin",
                "Born: April 16, 1889 in Walworth, London, England, UK",
                R.drawable.charli
            )
        )
        celeberityArrayList.add(
            Celeberity(
                "Jackie Chan",
                "Born: April 7, 1954 in Victoria Peak, Hong Kong",
                R.drawable.jaki
            )
        )
        celeberityArrayList.add(
            Celeberity(
                "Johnny Depp",
                "Born: June 9, 1963 in Owensboro, Kentucky, USA",
                R.drawable.jhony
            )
        )
        celeberityArrayList.add(
            Celeberity(
                "Keanu Reeves",
                "Born: September 2, 1964 in Beirut, Lebanon",
                R.drawable.reeves
            )
        )
        celeberityArrayList.add(
            Celeberity(
                "tom cruise",
                "Born: July 3, 1962 in Syracuse, New York, USA",
                R.drawable.toom
            )
        )

        adapter = RecyclerViewAdapter(celeberityArrayList)
        rvText.adapter = adapter
    }
}