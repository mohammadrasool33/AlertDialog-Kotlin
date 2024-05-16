package com.example.alertdialog

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val Btn:Button=findViewById(R.id.button)
        val alertDialog=AlertDialog.Builder(this).setTitle("Add contact").setMessage("Do you want add me?").setPositiveButton("Yes"){_,_->
            Toast.makeText(this,"you added me",Toast.LENGTH_LONG).show()
        }.setNegativeButton("No"){_,_-> Toast.makeText(this,"you added me",Toast.LENGTH_LONG).show()}.create()


        Btn.setOnClickListener {
            alertDialog.show();
        }
    }

}