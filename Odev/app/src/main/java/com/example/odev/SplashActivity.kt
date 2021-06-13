package com.example.odev

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.Toast


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splash()
    }
    private fun splash() {
        val resim: ImageView = findViewById(R.id.resim) as ImageView
        Handler().postDelayed({
            resim.setVisibility(View.VISIBLE)
            if(!internetKontrol())
            {
                Toast.makeText(this,"İnternet Bağlantınızı Kontrol Ediniz!", Toast.LENGTH_SHORT).show()
                finish()
            }
            else{
                Handler().postDelayed({
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                },2000)
            }
        },1000)
    }
    fun internetKontrol():Boolean {
        val manager=getSystemService(Context.CONNECTIVITY_SERVICE)as ConnectivityManager
        val networkInfo= manager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnectedOrConnecting
    }
}