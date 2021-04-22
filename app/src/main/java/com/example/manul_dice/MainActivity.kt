package com.example.manul_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        findViewById<ImageView>(R.id.manul_one).setOnClickListener{

            MainScope().launch {
                var RandomNumber = Random.nextInt(1..6)

                findViewById<ImageView>(R.id.manul_one).setImageResource(
                when(RandomNumber)
                {
                    1 -> R.drawable.one
                    2 -> R.drawable.two
                    3 -> R.drawable.three
                    4 -> R.drawable.four
                    5 -> R.drawable.five
                    6 -> R.drawable.six
                    else ->  R.drawable.ic_launcher_foreground
                })



            }



        }





    }
}