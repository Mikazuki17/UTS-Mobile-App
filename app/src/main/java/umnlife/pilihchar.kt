package umnlife

import android.widget.ImageView

class pilihchar(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}