package com.tads.prova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_calcula.setOnClickListener {

            val qt_Homens = nr_homem.text.toString()
            val qt_Mulheres = nr_mulheres.text.toString()
            val qt_Crianca = nr_crianca.text.toString()

            val intente = Intent(applicationContext, SegundaActivity::class.java)

            intente.putExtra("HOMEM", qt_Homens)
            intente.putExtra("MULHER", qt_Mulheres)
            intente.putExtra("CRIANCA", qt_Crianca)

            startActivity(intente)

        }
    }
}
