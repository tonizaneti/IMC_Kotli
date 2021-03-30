package com.studiozaneti.calculo_imc_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnEnter.setOnClickListener {
            var str = etText.text.toString()
            Snackbar.make(it, str, Snackbar.LENGTH_SHORT).setAction("Inverte") {
                str = ""
                for (x in etText.text.toString().length - 1 downTo 0) {
                    str += etText.text.toString()[x]
                }
                Snackbar.make(it, str, Snackbar.LENGTH_SHORT).show()
            }.show()
        }
    }
}