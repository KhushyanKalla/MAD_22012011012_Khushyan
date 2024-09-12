package com.example.a22012011012_khushyan

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    val TAG="Main_Acitivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showMessage("onCreate Function is Called")

    }
    private fun showMessage(msg : String){
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
    private fun showToastMessage(message: String) {
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    private fun showSnackbarmsg(msg: String){
        Log.i(TAG, msg)
        Snackbar.make(findViewById(R.id.main), msg, Snackbar.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart Is Called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause Is Called")
    }

    override fun onStop() {
        super.onStop()
        showToastMessage("onStop Is Called")
    }

    override fun onResume() {
        super.onResume()
        showToastMessage("onResume Is Called")
    }

    override fun onRestart() {
        super.onRestart()
        showSnackbarmsg("onRestart Is Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToastMessage("onDestroy Is Called")
    }

}
