package com.skillsground.game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class GodotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val launchIntent = packageManager.getLaunchIntentForPackage("com.skillsground.solitaire")
        if (launchIntent != null) {
            startActivity(launchIntent)
        } else {
            // Handle the case where the Godot game isn't installed
        }
        finish() // Close the activity once the game is launched
    }
}
