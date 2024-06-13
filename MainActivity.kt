package com.school.playoutdoors

import android.content.Intent
import android.os.Bundle

import com.google.android.material.bottomnavigation.BottomNavigationView

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI

import com.school.playoutdoors.databinding.ActivityMainBinding

class MainActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var camp_search = null
        camp_search.setOnClickListener {
            val intent = Intent(this, CampSearch::class.java)
            startActivity(intent)

            val actionBar = supportActionBar

            "Home".also { this!!.title = it }

            actionBar.run {

                "Home".also { this!!.title = it }

                setDisplayHomeAsEnabled(true)
            }
        }
    }

    private fun setDisplayHomeAsEnabled(b: Boolean) {

    }
}

private fun Nothing?.setOnClickListener(function: () -> Unit) {

}
