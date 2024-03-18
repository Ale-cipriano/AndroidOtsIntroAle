package com.example.androidotsintroale

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MisingInlfatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        // Botão de envio de informações
        val btnEnviar = findViewById<Button>(R.id.btn_enviar)
        // Exibir informações
        val txtResult  = findViewById<TextView>(R.id.txt_result)
        // Inserir informações
        val edText = findViewById<EditText>(R.id.edText)

        val inputName = edText.text

        // Botão de envio de informações
              btnEnviar.setOnClickListener {

                  if(inputName.isBlank()) {
                      edText.error = "Este campo não pode ser vazio"
                  }else {

                      txtResult.text = edText.text
                  }
        }
    }
}