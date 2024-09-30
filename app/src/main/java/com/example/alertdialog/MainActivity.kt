package com.example.alertdialog

import android.content.DialogInterface
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

       val button  = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val dialog = AlertDialog.Builder(this)

            dialog.setTitle("Delete File")
            dialog.setMessage("Do you want to delete this file.")
            dialog.setIcon(R.drawable.file)

            // yes
            dialog.setPositiveButton("YES"){DialogInterface,which ->
                Toast.makeText(this, "File is deleted", Toast.LENGTH_SHORT).show()
            }
            // no
            dialog.setNegativeButton("NO"){DialogInterface,which ->
                Toast.makeText(this, "Not deleted", Toast.LENGTH_SHORT).show()
            }
            // cancel
            dialog.setNeutralButton("CANCEL"){DialogInterface,which ->
                Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show()
            }

            // show alert dialog
            val alertDialog: AlertDialog = dialog.create()
            alertDialog.setCancelable(false) // except the alert(ke alawa) box  we click anywhere so not remove alert box
            alertDialog.show()
        }
    }
}