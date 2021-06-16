package com.juan.formapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.juan.formapp.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext.setOnClickListener {

            val user = User(name = binding.edittextName.text.toString()
                , date = "${binding.datepickerBirthDate.year}/${binding.datepickerBirthDate.month}/${binding.datepickerBirthDate.dayOfMonth}"
                , phone = binding.edittextPhone.text.toString()
                , email = binding.edittextEmail.text.toString()
                , description = binding.edittextDescription.text.toString()
            )

            val intent = Intent(this, ConfirmActivity::class.java)
            intent.putExtra("name", user.name)
            intent.putExtra("phone", "Tel: ${user.phone}")
            intent.putExtra("date", "Fecha de nacimiento: ${user.date}")
            intent.putExtra("email", "Email: ${user.email}")
            intent.putExtra("description", "Descripción: ${user.description}")
            startActivity(intent)
        }
    }
}