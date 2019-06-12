package com.nmp.genericrecyclerview

import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nmp.genericrecyclerview.demo.ContactAdapter
import com.nmp.genericrecyclerview.demo.Data
import com.nmp.library.OnRecyclerItemClickListener

class MainActivity : AppCompatActivity(), OnRecyclerItemClickListener {
    override fun onItemClicked(view: View?, position: Int) {
        Toast.makeText(this, dummyData()[position].phoneNumber, LENGTH_SHORT).show()
    }

    private lateinit var adapter: ContactAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rcvContact)

        adapter = ContactAdapter(this)
        adapter.setItems(dummyData())
        adapter.setListener(this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun dummyData(): List<Data> {
        val list = mutableListOf(
            Data("Phat", "0842xxxxxx"),
            Data("Phat2", "0842xxxxxx"),
            Data("Phat3", "0842xxxxxx")
        )
        return list
    }

}
