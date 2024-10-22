package br.unisanta.loginapp.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.loginapp.AdapterUser.AdapterUsuario
import br.unisanta.loginapp.R
import br.unisanta.loginapp.ViewModel.LoginViewModel
import br.unisanta.loginapp.databinding.ActivityFormLoginBinding

class TelaPrincipal : AppCompatActivity() {
    private lateinit var binding: ActivityFormLoginBinding // Declare a instância do binding correta
    val dao = LoginViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        supportActionBar?.hide()

        setContentView(R.layout.activity_main)
        val rvUsuarios = findViewById<RecyclerView>(R.id.Lista)
        val Usuario = dao.ObterUsuarios()
        rvUsuarios.layoutManager = LinearLayoutManager(this)
        rvUsuarios.adapter = AdapterUsuario(Usuario)
    }
}