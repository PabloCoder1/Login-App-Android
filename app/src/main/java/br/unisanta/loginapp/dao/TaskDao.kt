package br.unisanta.loginapp.dao

import br.unisanta.loginapp.model.Task

class TaskDao {

    companion object{
        private val task = mutableListOf<Task>()
    }
    fun adicionarUsuario(task:Task){
        Companion.task.add(task)
    }
    fun obterUsuarios():List<Task>{
        return Companion.task
    }
}