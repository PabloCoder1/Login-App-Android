package br.unisanta.loginapp.AdapterUser

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.loginapp.R
import br.unisanta.loginapp.model.Task

class AdapterUsuario(private val Usuario:List<Task>):
    RecyclerView.Adapter<AdapterUsuario.ViewHolder>()  {

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val txvNome: TextView = itemView.findViewById(R.id.textNomeUsuario)
        val txvSenha: TextView = itemView.findViewById(R.id.textEmailUsuario)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_tela_principal,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val Usuario = Usuario[position]
        holder.txvNome.text = Usuario.Email
        holder.txvSenha.text = Usuario.Senha

    }
    override fun getItemCount(): Int {
        return Usuario.size
    }
}