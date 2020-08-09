package com.example.casino

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.blackjack.*

var valueD1 = 0
var valueD2 = 0
var valueP1 = 0
var valueP2 = 0
var valueP3 = 0
var valueP4 = 0
var valueP5 = 0

open class cardToInt : AppCompatActivity() {

    fun cardToIntMechanism() {


        when (d1.text) {
            "1" -> valueD1 = 1
            "2" -> valueD1 = 2
            "3" -> valueD1 = 3
            "4" -> valueD1 = 4
            "5" -> valueD1 = 5
            "6" -> valueD1 = 6
            "7" -> valueD1 = 7
            "8" -> valueD1 = 8
            "9" -> valueD1 = 9
            "10" -> valueD1 = 10
            "11" -> valueD1 = 11
            "12" -> valueD1 = 12
            "13" -> valueD1 = 13

        }
        when (d2.text) {
            "1" -> valueD2 = 1
            "2" -> valueD2 = 2
            "3" -> valueD2 = 3
            "4" -> valueD2 = 4
            "5" -> valueD2 = 5
            "6" -> valueD2 = 6
            "7" -> valueD2 = 7
            "8" -> valueD2 = 8
            "9" -> valueD2 = 9
            "10" -> valueD2 = 10
            "11" -> valueD2 = 11
            "12" -> valueD2 = 12
            "13" -> valueD2 = 13

        }
        when (p1.text) {
            "1" -> valueP1 = 1
            "2" -> valueP1 = 2
            "3" -> valueP1 = 3
            "4" -> valueP1 = 4
            "5" -> valueP1 = 5
            "6" -> valueP1 = 6
            "7" -> valueP1 = 7
            "8" -> valueP1 = 8
            "9" -> valueP1 = 9
            "10" -> valueP1 = 10
            "11" -> valueP1 = 11
            "12" -> valueP1 = 12
            "13" -> valueP1 = 13

        }
        when (p2.text) {
            "1" -> valueP2 = 1
            "2" -> valueP2 = 2
            "3" -> valueP2 = 3
            "4" -> valueP2 = 4
            "5" -> valueP2 = 5
            "6" -> valueP2 = 6
            "7" -> valueP2 = 7
            "8" -> valueP2 = 8
            "9" -> valueP2 = 9
            "10" -> valueP2 = 10
            "11" -> valueP2 = 11
            "12" -> valueP2 = 12
            "13" -> valueP2 = 13

        }

        when (p3.text) {
            "1" -> valueP3 = 1
            "2" -> valueP3 = 2
            "3" -> valueP3 = 3
            "4" -> valueP3 = 4
            "5" -> valueP3 = 5
            "6" -> valueP3 = 6
            "7" -> valueP3 = 7
            "8" -> valueP3 = 8
            "9" -> valueP3 = 9
            "10" -> valueP3 = 10
            "11" -> valueP3 = 11
            "12" -> valueP3 = 12
            "13" -> valueP3 = 13
        }

        when (p4.text) {
            "1" -> valueP4 = 1
            "2" -> valueP4 = 2
            "3" -> valueP4 = 3
            "4" -> valueP4 = 4
            "5" -> valueP4 = 5
            "6" -> valueP4 = 6
            "7" -> valueP4 = 7
            "8" -> valueP4 = 8
            "9" -> valueP4 = 9
            "10" -> valueP4 = 10
            "11" -> valueP4 = 11
            "12" -> valueP4 = 12
            "13" -> valueP4 = 13
        }

        when (p5.text) {
            "1" -> valueP5 = 1
            "2" -> valueP5 = 2
            "3" -> valueP5 = 3
            "4" -> valueP5 = 4
            "5" -> valueP5 = 5
            "6" -> valueP5 = 6
            "7" -> valueP5 = 7
            "8" -> valueP5 = 8
            "9" -> valueP5 = 9
            "10" -> valueP5 = 10
            "11" -> valueP5 = 11
            "12" -> valueP5 = 12
            "13" -> valueP5 = 13
        }
    }
}