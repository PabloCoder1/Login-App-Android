package br.unisanta.loginapp.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import br.unisanta.loginapp.databinding.ActivityFormCadastroBinding
import br.unisanta.loginapp.model.Task


class FormCadastro : AppCompatActivity() {

    private lateinit var binding: ActivityFormCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFormCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnCadastrar.setOnClickListener{
            val UserName = binding.editNome.text.toString()
            val UserEmail = binding.editEmail.text.toString()
            val UserPassword = binding.editSenha.text.toString()
            val User = Task(UserName, UserEmail, UserPassword)
            Toast.makeText(this, "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show()
        }

    }
}