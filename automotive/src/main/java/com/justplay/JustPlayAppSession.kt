package com.justplay

import android.content.Intent
import androidx.car.app.Screen
import androidx.car.app.Session

class JustPlayAppSession : Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        return PlayAppScreen(carContext)
    }
}