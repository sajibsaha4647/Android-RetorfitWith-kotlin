package com.example.retrofitwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val getQuotesApi = RetrofitHelpers.getInstance().create(QuotesApi::class.java)

        GlobalScope.launch {
            val result = getQuotesApi.getQuotes(1)
            if(result !== null){
                val quitelist = result.body()
                if (quitelist != null) {
                    quitelist.results.forEach(){
                        Log.d("success",it.content.toString())
                    }
                }


            }
        }

    }
}