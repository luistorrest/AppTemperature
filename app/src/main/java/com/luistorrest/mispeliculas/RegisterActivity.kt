package com.luistorrest.mispeliculas

import RegisterViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.luistorrest.mispeliculas.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {


    private lateinit var registerBinding: ActivityRegisterBinding
    private lateinit var registerViewModel: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = registerBinding.root
        setContentView(view)

        registerViewModel = ViewModelProvider(this)[RegisterViewModel::class.java]

        registerBinding.buttonConvert.setOnClickListener {

            registerViewModel.convertirGrados(registerBinding.CelsiusEditText.text.toString(),)

            /*if(registerBinding.CelsiusEditText.text.toString().isEmpty()) {
                Toast.makeText(this,"Ingrese una temperatura",Toast.LENGTH_LONG).show()
            }

            else {
                val celsius = registerBinding.CelsiusEditText.text.toString()
                var kelvin = celsius.toFloat() + 273.15
                registerBinding.infoTextView.setText(kelvin.toString() + " K")
                Toast.makeText(this,"Se ha convertido los grados a kelvin",Toast.LENGTH_LONG).show()
            }*/

        }
    }
}