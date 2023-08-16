package com.justplay

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.CarText.Builder
import androidx.car.app.model.Pane
import androidx.car.app.model.PaneTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template


class PlayAppScreen(carContext: CarContext) : Screen(carContext) {

    override fun onGetTemplate(): Template {
        val row = Row.Builder().setTitle("Welcome to just play").build()

        return PaneTemplate.Builder(
            Pane.Builder()
                .addRow(row)
                .build()
        ).setHeaderAction(Action.APP_ICON).build()
    }
}