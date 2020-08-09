package com.example.casino

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.blackjack.*

class HitButton : MainActivity() {


    fun Hit() {

        hit.setOnClickListener {
            if (p3.visibility == View.INVISIBLE) {
                p3.visibility = View.VISIBLE
            } else if (p4.visibility == View.INVISIBLE) {
                p4.visibility = View.VISIBLE
            } else if (p5.visibility == View.INVISIBLE) {
                p5.visibility = View.VISIBLE
            } else if (p5.visibility == View.VISIBLE) {
                YoYo.with(Techniques.Pulse).duration(2000).playOn(p1)
            }

//                    .duration(2000)
//                    .playOn(p1)
            //make an animation and show why it cant be done


        }

    }

}
