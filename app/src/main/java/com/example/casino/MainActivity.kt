package com.example.casino

import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.blackjack.*
import kotlin.random.Random


val min = 0
var balance = 100
var bet = 0
var max = balance

open class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val randomD1 = Random.nextInt(1, 13)
        val randomD2 = Random.nextInt(1, 13)
        val randomD3 = Random.nextInt(1, 13)
        val randomD4 = Random.nextInt(1, 13)
        val randomD5 = Random.nextInt(1, 13)

        val randomP1 = Random.nextInt(1, 13)
        val randomP2 = Random.nextInt(1, 13)
        val randomP3 = Random.nextInt(1, 13)
        val randomP4 = Random.nextInt(1, 13)
        val randomP5 = Random.nextInt(1, 13)

        var pHand = randomP1 + randomP2
        val dHand = valueD1 + valueD2

        BL.setOnClickListener {
            setContentView(R.layout.blackjack)

            p3.visibility = View.INVISIBLE
            p4.visibility = View.INVISIBLE
            p5.visibility = View.INVISIBLE

            d3.visibility = View.INVISIBLE
            d4.visibility = View.INVISIBLE
            d5.visibility = View.INVISIBLE

            d1.text = randomD1.toString()
            d2.text = randomD2.toString()
            d3.text = randomD3.toString()
            d4.text = randomD4.toString()
            d5.text = randomD5.toString()
            p1.text = randomP1.toString()
            p2.text = randomP2.toString()
            p3.text = randomP3.toString()
            p4.text = randomP4.toString()
            p5.text = randomP5.toString()

            pHand = valueP1 + valueP2
            if (p3.visibility == View.VISIBLE) {
                pHand += valueP3
            }
            if (p4.visibility == View.VISIBLE) {
                pHand += valueP4
            }
            if (p4.visibility == View.VISIBLE) {
                pHand += valueP5
            }

            hit.setOnClickListener {
                if (p3.visibility == View.INVISIBLE) {
                    p3.visibility = View.VISIBLE
                } else if (p4.visibility == View.INVISIBLE) {
                    p4.visibility = View.VISIBLE
                } else if (p5.visibility == View.INVISIBLE) {
                    p5.visibility = View.VISIBLE
                } else if (p5.visibility == View.VISIBLE) {
                    YoYo.with(Techniques.Bounce).duration(150).playOn(hit)
                }
            }

            outCome.visibility = View.INVISIBLE

            cardToInt()

            outCome.visibility = View.VISIBLE
            if (pHand > dHand) {
                outCome.text = ("You Win!")
            } else if (pHand < dHand) {
                outCome.text = ("You Lose!")
            } else {
                outCome.text = ("Pushhhhh")
            }

//            if (pHand > 21) {
//            } else if (pHand == 21) {
//                cmmndBot.text =
//                    ("are you sure you would like to proceed your odds of winning are low (%0)")
//            }
//            surrender.setOnClickListener {
//                if (p3.visibility == View.INVISIBLE) // add a variable of first cards or has been hit and replace.
//            balance += }

            stand.setOnClickListener {
                while (d5.visibility == View.INVISIBLE) {
                    when (pHand < 17) {
                        (d3.visibility == View.INVISIBLE) -> d3.visibility = View.VISIBLE
                        (d3.visibility == View.VISIBLE) -> d4.visibility = View.VISIBLE
                        (d4.visibility == View.VISIBLE) -> d5.visibility = View.VISIBLE
                    }

                }

            }

            // blackjack seek bar info start
            seekBar.max = (max - min)
            seekBar.setOnSeekBarChangeListener(this)

        }
// above } is where you write scududles
    }


    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        val progress_custom = min + progress
        this.progress!!.text = progress_custom.toString()
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        this.seekBarStatus?.text = ("started tracking touch")

    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        this.seekBarStatus?.text = ("stopped tracking touch")
    }
// blackjack seek bar info end

}

