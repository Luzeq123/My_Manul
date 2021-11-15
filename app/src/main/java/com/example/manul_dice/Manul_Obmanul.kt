package com.example.manul_dice

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random
import kotlin.random.nextInt

class Manul_Obmanul : AppCompatActivity() {

    private var soundPool: SoundPool? = null
    private var soundId1 = 0
    private var soundId2 = 0
    private var soundId3 = 0
    private var soundId4 = 0
    private var soundId5 = 0
    private var soundId6 = 0
    private var soundId7 = 0
    private var soundId8 = 0
    private var soundId9 = 0
    private var soundId10 = 0
    private var soundId11 = 0
    private var soundId12 = 0
    private var soundId13 = 0
    private var soundId14 = 0
    private var soundId15 = 0
    private var soundId16 = 0
    private var soundId17 = 0
    private var soundId18 = 0
    private var left_volume = 1F
    private var right_volume = 1F
    private var sound_priority_globall = 1

    fun playSound(sound: Int) {
        var soundIdBuffer = 0
        when (sound) {
            1 -> soundIdBuffer = soundId1
            2 -> soundIdBuffer = soundId2
            3 -> soundIdBuffer = soundId3
            4 -> soundIdBuffer = soundId4
            5 -> soundIdBuffer = soundId5
            6 -> soundIdBuffer = soundId6
            7 -> soundIdBuffer = soundId7
            8 -> soundIdBuffer = soundId8
            9 -> soundIdBuffer = soundId9
            10 -> soundIdBuffer = soundId10
            11 -> soundIdBuffer = soundId11
            12 -> soundIdBuffer = soundId12
            13 -> soundIdBuffer = soundId13 //raboch
            14 -> soundIdBuffer = soundId14//raboch
            15 -> soundIdBuffer = soundId15//crash
            16 -> soundIdBuffer = soundId16//closedh
            17 -> soundIdBuffer = soundId17//openh
            18 -> soundIdBuffer = soundId18//bochka
        }
        soundPool?.play(soundIdBuffer, left_volume, right_volume, 0, 0, 1F)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        soundPool = SoundPool(25, AudioManager.STREAM_MUSIC, 0)
        soundId1 = soundPool!!.load(baseContext, R.raw.one, sound_priority_globall)
        soundId2 = soundPool!!.load(baseContext, R.raw.two, sound_priority_globall)
        soundId3 = soundPool!!.load(baseContext, R.raw.three, sound_priority_globall)
        soundId4 = soundPool!!.load(baseContext, R.raw.four, sound_priority_globall)
        soundId5 = soundPool!!.load(baseContext, R.raw.five, sound_priority_globall)
        soundId6 = soundPool!!.load(baseContext, R.raw.six, sound_priority_globall)
        soundId7 = soundPool!!.load(baseContext, R.raw.seven, sound_priority_globall)
        soundId8 = soundPool!!.load(baseContext, R.raw.eight, sound_priority_globall)
        soundId9 = soundPool!!.load(baseContext, R.raw.nine, sound_priority_globall)
        soundId10 = soundPool!!.load(baseContext, R.raw.ten, sound_priority_globall)
        soundId11 = soundPool!!.load(baseContext, R.raw.eleven, sound_priority_globall)
        soundId12 = soundPool!!.load(baseContext, R.raw.twelve, sound_priority_globall)

        soundId13 = soundPool!!.load(baseContext, R.raw.rabochiy, sound_priority_globall)
        soundId14 = soundPool!!.load(baseContext, R.raw.rabochiy2, sound_priority_globall)
        soundId15 = soundPool!!.load(baseContext, R.raw.crash, sound_priority_globall)
        soundId16 = soundPool!!.load(baseContext, R.raw.hihatclosed1, sound_priority_globall)
        soundId17 = soundPool!!.load(baseContext, R.raw.hihatopened1, sound_priority_globall)
        soundId18 = soundPool!!.load(baseContext, R.raw.bochka, sound_priority_globall)


//        findViewById<ImageView>(R.id.iv_one).setOnClickListener { MainScope().launch { playSound(1) } }
//        findViewById<ImageView>(R.id.iv_two).setOnClickListener { MainScope().launch { playSound(2) } }
//        findViewById<ImageView>(R.id.iv_three).setOnClickListener { MainScope().launch { playSound(3) } }



        findViewById<ImageView>(R.id.iv_four).setOnClickListener { MainScope().launch { playSound(18) } }
        findViewById<ImageView>(R.id.iv_five).setOnClickListener { MainScope().launch { playSound(16) } }
        findViewById<ImageView>(R.id.iv_six).setOnClickListener { MainScope().launch { playSound(13) } }



        findViewById<ImageView>(R.id.manul_one).setOnClickListener {
            MainScope().launch {
                //Инициализация переменных:

                //RandomBlock
                var RandomNumber = Random.nextInt(1..6)
                var Rotate_XY = Random.nextBoolean()
                var Rotate_Direction = arrayListOf<Int>(-1, 1).random()


                //Constant Block
                var Rotation_Time: Long = 1
                var begin_rotation_cycle1 = 0
                var end_rotation_cycle1 = 89
                var begin_rotation_cycle2 = 90
                var end_rotation_cycle2 = 179




                for (i in 1..4) {


                    RandomNumber = Random.nextInt(1..6)
                    Rotate_XY = Random.nextBoolean()
                    Rotate_Direction = arrayListOf<Int>(-1, 1).random()



                    if (Rotate_XY) {
                        for (i in begin_rotation_cycle1..end_rotation_cycle1) {
                            it.rotationX = it.rotationX + Rotate_Direction
                            delay(Rotation_Time)

                        }
                    } else {
                        for (i in begin_rotation_cycle1..end_rotation_cycle1) {
                            it.rotationY = it.rotationY + Rotate_Direction
                            delay(Rotation_Time)

                        }
                    }

                    findViewById<ImageView>(R.id.manul_one).setImageResource(
                        when (RandomNumber) {
                            1 -> R.drawable.one
                            2 -> R.drawable.two
                            3 -> R.drawable.three
                            4 -> R.drawable.four
                            5 -> R.drawable.five
                            6 -> R.drawable.six
                            else -> R.drawable.ic_launcher_foreground
                        }
                    )

                    if (Rotate_XY) {
                        for (i in begin_rotation_cycle2..end_rotation_cycle2) {
                            it.rotationX = it.rotationX + Rotate_Direction
                            delay(Rotation_Time)
                        }
                    } else {
                        for (i in begin_rotation_cycle2..end_rotation_cycle2) {
                            it.rotationY = it.rotationY + Rotate_Direction
                            delay(Rotation_Time)
                        }
                    }


                }
            }
        }
    }

    fun playSound18(view: View) {
        soundPool?.play(soundId18, 1F, 1F, 0, 0, 1F)
    }
    fun playSound16(view: View) {
        soundPool?.play(soundId16, 1F, 1F, 0, 0, 1F)
    }
    fun playSound13(view: View) {
        soundPool?.play(soundId13, 1F, 1F, 0, 0, 1F)
    }

}