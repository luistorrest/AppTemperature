package com.luistorrest.mispeliculas

import RegisterViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
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

        //Muestra los grados kelvin
        val  kelvinObserver = Observer<Double>{kelvin ->
            registerBinding.infoTextView.setText(kelvin.toString())
        }

        registerViewModel.kelvin.observe(this,kelvinObserver)

        //Muerstra el mensaje de error
        val errorMsgObserver =Observer<String>{errorMsg ->
            Snackbar.make(view,errorMsg,Snackbar.LENGTH_INDEFINITE)
                .setAction("Aceptar"){}
                .show()

        }

        registerViewModel.errorMsg.observe(this,errorMsgObserver)

        registerBinding.buttonConvert.setOnClickListener {

        registerViewModel.convertirGrados(registerBinding.CelsiusEditText.text.toString(),)
        }
    }
}