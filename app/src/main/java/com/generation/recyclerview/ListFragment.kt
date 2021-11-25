package com.generation.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.generation.recyclerview.R
import com.generation.recyclerview.adapter.TarefaAdapter
import com.generation.recyclerview.model.Tarefas

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {
    val adapter=TarefaAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view:View= inflater.inflate(R.layout.fragment_list, container, false)
        val rvList:RecyclerView by lazy {
         view.findViewById(R.id.rv_list)
        }
        rvList.adapter=adapter

        rvList.layoutManager=LinearLayoutManager(context)
        adapter.updateList(
            arrayListOf(
                Tarefas("Fazer essa merda","Matheus cortez ","24/11","00h","causando suicidio",),

                Tarefas("Fazer essa merda 2","Matheus cortez ","24/11","00h","causando suicidio",)
            )

        )
        return view
        }




}