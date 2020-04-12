package com.example.titanhacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.ml.vision.FirebaseVision
import com.google.firebase.ml.vision.common.FirebaseVisionImage
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_login.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        uploadImagebtn.setOnClickListener {
            startActivity(Intent(this,TextActivity::class.java))
            finish()
        }

        allergiesBtn.setOnClickListener{
            startActivity(Intent(this,AllergyActivity::class.java))
            finish()
        }
    }
}
