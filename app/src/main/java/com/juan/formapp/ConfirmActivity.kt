package com.juan.formapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.juan.formapp.databinding.ActivityConfirmBinding

class ConfirmActivity : AppCompatActivity() {

    private lateinit var binding : ActivityConfirmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfirmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.textviewName.text = intent.getStringExtra("name")
        binding.textviewDate.text = intent.getStringExtra("date")
        binding.textviewPhone.text = intent.getStringExtra("phone")
        binding.textviewEmail.text = intent.getStringExtra("email")
        binding.textviewDescription.text = intent.getStringExtra("description")

        binding.buttonEdit.setOnClickListener {
            finish()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}