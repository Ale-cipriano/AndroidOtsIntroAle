package com.example.androidotsintroale

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

/* class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
     /*   ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } */

        val btnEnviar = findViewById<Button>(R.id.btn_enviar)
        val txtResult = findViewById<TextView>(R.id.txt_result)

        btnEnviar.setOnContextClickListener {
            txtResult.text = "Alessandro Cipriano Gonzaga"
        }
    }
}
*/

class MainActivity : AppCompatActivity() {
    // @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botão de envio de informações
        val btnEnviar = findViewById<Button>(R.id.btn_enviar)
        // Exibir informações
        val txtResult = findViewById<TextView>(R.id.txt_result)
        // Inserir informações
        // val edText = findViewById<EditText>(R.id.edText)
        // Abrir nova tela
        // val abrirNovaTela = findViewById<Button>(R.id.btnNovaTela)

        // Variável que armazena informaões inseridas
        // val inputName = edText.text

        // Botão de envio de informações
        btnEnviar.setOnClickListener {
        txtResult.text = "Alessandro Cipriano Gonzaga"

        }
    }
}