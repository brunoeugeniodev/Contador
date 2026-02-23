package com.example.contador

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtContador = findViewById<TextView>(R.id.activity_main_contador)
        val btnAumentar = findViewById<Button>(R.id.activity_main_btn_aumentar)
        val btnDiminuir = findViewById<Button>(R.id.activity_main_btn_diminuir)
        val btnResetar = findViewById<Button>(R.id.activity_main_btn_resetar)

        fun atualizarUI() {
            txtContador.text = contador.toString()
            btnDiminuir.isEnabled = contador > 0
        }

        atualizarUI()

        btnAumentar.setOnClickListener {
            txtContador.text = "${++contador}"
            atualizarUI()
        }

        btnAumentar.setOnLongClickListener {
            contador += 10
            txtContador.text = "$contador"
            atualizarUI()
            true
        }

        btnDiminuir.setOnClickListener {
            txtContador.text = "${--contador}"
            atualizarUI()
        }

        btnDiminuir.setOnLongClickListener {
            if(contador > 10){
                contador -= 10
            }else{
                contador = 0
            }
            txtContador.text = "$contador"
            atualizarUI()
            true
        }

        btnResetar.setOnClickListener {
            contador = 0
            txtContador.text = "$contador"
            atualizarUI()
        }
    }
}