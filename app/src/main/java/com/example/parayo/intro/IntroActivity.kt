package com.example.parayo.intro

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.parayo.api.ParayoApi
import kotlinx.coroutines.runBlocking
import org.jetbrains.anko.setContentView

class IntroActivity: Activity() {
    constructor() : super()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = IntroActivityUI()
        ui.setContentView(this)

        runBlocking {
            try {
                val response = ParayoApi.instance.hello()
                response.data?.let { Log.d("IntroActivity", it) }
            } catch (e: Exception) {
                Log.e("IntroActivity", "HelloAPi 호출 오류", e)
            }
        }
    }
}