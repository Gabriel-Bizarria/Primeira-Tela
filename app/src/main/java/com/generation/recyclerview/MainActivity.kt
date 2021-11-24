package com.generation.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.generation.recyclerview.adapter.TarefaAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val recyclerTarefa: RecyclerView by lazy{
        findViewById<RecyclerView>(R.id.listaItens)
    }


}