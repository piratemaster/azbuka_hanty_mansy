package com.example.myapplicationazbuka2

import android.app.Application
import uk.co.chrisjenx.calligraphy.CalligraphyConfig


class App : Application() {
    override fun onCreate() {
        super.onCreate()

        CalligraphyConfig.initDefault(
            CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/pt_serif.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )
    }
}