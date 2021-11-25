package com.generation.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.generation.recyclerview.R
import com.generation.recyclerview.model.Tarefas

class TarefaAdapter():
    RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

    val taskList: MutableList<Tarefas> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tarefa, parent, false)

        return TarefaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        holder.binding(taskList[position])
    }


    fun updateList(tasklist:List<Tarefas>){
        this.taskList.clear()
        this.taskList.addAll(tasklist)
        notifyDataSetChanged()

    }
    /**
     * Retorna o tamanho da lista
     */
    override fun getItemCount(): Int {
        return taskList.size
    }

    class TarefaViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview){

        val textViewNome = itemview.findViewById<TextView>(R.id.nomeTarefa)
        val textViewData = itemview.findViewById<TextView>(R.id.dataTarefa)
        val textViewHora = itemview.findViewById<TextView>(R.id.textHora)


        fun binding(tarefa: Tarefas){
           textViewNome?.text = tarefa.nomeTarefa
            textViewData?.text = tarefa.diaConcluir
            textViewHora?.text = tarefa.horaConcluir
        }
    }

}