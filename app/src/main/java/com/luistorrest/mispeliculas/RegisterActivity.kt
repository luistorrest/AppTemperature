package com.luistorrest.mispeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.luistorrest.mispeliculas.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {


    private lateinit var registerBinding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = registerBinding.root
        setContentView(view)

        registerBinding.buttonConvert.setOnClickListener {

            if(registerBinding.CelsiusEditText.text.toString().isEmpty()) {
                Toast.makeText(this,"Ingrese una temperatura",Toast.LENGTH_LONG).show()
            }

            else {
                val celsius = registerBinding.CelsiusEditText.text.toString()
                var kelvin = celsius.toFloat() + 273.15
                registerBinding.infoTextView.setText(kelvin.toString() + " K")
                Toast.makeText(this,"Se ha convertido los grados a kelvin",Toast.LENGTH_LONG).show()
            }

        }
    }
}