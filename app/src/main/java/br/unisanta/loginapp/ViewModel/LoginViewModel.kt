package br.unisanta.loginapp.ViewModel

import androidx.lifecycle.ViewModel
import br.unisanta.loginapp.model.Task

class LoginViewModel:ViewModel() {
    companion object{
        private  val usuarios = mutableListOf<Task>()    }

    fun ObterUsuarios():List<Task>{
        return Companion.usuarios
    }
    fun entrar(user:Task):String{
        val ObterEmail = usuarios.find { it.Email==user.Email}
        val ObterSenha = usuarios.find {it.Senha==user.Senha }
        val ObterUser = usuarios.find { it.Email==user.Email&&it.Senha==user.Senha}

        if (ObterUser!=null){
            return "Login Realizado com Sucesso!"
        }else{
            return "Login Invalido!"
        }
    }
    fun cadastrar(user:Task):String{
        val Confere = usuarios.find { it.Email==user.Email }
        if (Confere == null){
            usuarios.add(user)
            return "Cadastrado com Sucesso!"

        }else{
            return "Esse Login já existe"
        }
    }
}