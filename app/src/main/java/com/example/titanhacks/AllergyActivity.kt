package com.example.titanhacks

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_allergy.*

class AllergyActivity : AppCompatActivity() {
    var allergies: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_allergy)

        saveBtn.setOnClickListener{
            startActivity(Intent(this,DashboardActivity::class.java))
            finish()
        }
    }

}
