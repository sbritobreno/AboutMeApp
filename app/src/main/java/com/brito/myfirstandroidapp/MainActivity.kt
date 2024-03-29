 package com.brito.myfirstandroidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val educationBtn = findViewById<Button>(R.id.educationBtn)
        educationBtn.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)

            startActivity(intent)
        }

        val skillsBtn = findViewById<Button>(R.id.skillsBtn)
        skillsBtn.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        val hobbiesBtn = findViewById<Button>(R.id.hobbiesBtn)
        hobbiesBtn.setOnClickListener{
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }

        val achievementsBtn = findViewById<Button>(R.id.achievementsBtn)
        achievementsBtn.setOnClickListener{
            val intent = Intent(this, AchievementsActivity::class.java)
            startActivity(intent)
        }

        val exitBtn = findViewById<ImageButton>(R.id.exitIcon)
        exitBtn.setOnClickListener{
            val eBuilder = AlertDialog.Builder(this)
            eBuilder.setTitle("Exit")
            eBuilder.setIcon(R.drawable.ic_baseline_warning_24)
            eBuilder.setMessage("Do you really want to exit ?")
            eBuilder.setPositiveButton("Yes"){
                Dialog, which->
                finish()
            }
            eBuilder.setNegativeButton("No"){
                    Dialog, which->
            }
            val createBuild = eBuilder.create()
            createBuild.show()
        }
    }
}