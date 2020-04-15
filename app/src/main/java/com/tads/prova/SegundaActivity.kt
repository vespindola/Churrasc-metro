package com.tads.prova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val qtde: Bundle? = intent.extras

        val qtde_Homens = qtde?.getString("HOMEM")
        val qtde_Mulheres = qtde?.getString("MULHER")
        val qtde_Criancas = qtde?.getString("CRIANCA")

        calcular_kg(qtde_Homens.toString(), qtde_Mulheres.toString(), qtde_Criancas.toString())
    }

    private fun calcular_kg (qtde_Homens: String, qtde_Mulheres: String, qtde_Criancas: String) {

        val homem = qtde_Homens.toDouble()
        val mulher = qtde_Mulheres.toDouble()
        val crianca = qtde_Criancas.toDouble()

        val carne_Homem = homem * (0.3)
        val linguica_Homem = homem * (0.1)

        val carne_Mulher = mulher * (0.25)
        val linguica_Mulher = mulher * (0.05)

        val carne_Crianca  = crianca * (0.18)
        val liguica_Crianca = crianca * (0.02)

        val carneTotal = (carne_Homem + carne_Mulher + carne_Crianca)
        val linguicaTotal = (liguica_Crianca + linguica_Homem  + linguica_Mulher)

        kg_carne.setText(carneTotal.toString() + "Kg")
        kg_linguica.setText(linguicaTotal.toString() + "Kg")

    }

}
