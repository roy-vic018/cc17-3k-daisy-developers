package com.example.daisy

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class DashboardActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        // Initialize buttons
        val assistiveCommBtn: Button = findViewById(R.id.assistive_communication_btn)
        val moneyDetectionBtn: Button = findViewById(R.id.money_detection_btn)
        val navigationAssistantBtn: Button = findViewById(R.id.navigation_assistant_btn)
        val transportationBtn: Button = findViewById(R.id.transportation_btn)
        val micBtn: ImageButton = findViewById(R.id.mic_btn)
        val backspaceBtn: ImageButton = findViewById(R.id.backspace_Btn)
        val emergencyBtn: ImageButton = findViewById(R.id.emergency_btn)
        val homeBtn: ImageButton = findViewById(R.id.home_btn)
        val settingsBtn: ImageButton = findViewById(R.id.settings_btn)

        // Set onClickListeners for each button
        assistiveCommBtn.setOnClickListener {
            Toast.makeText(this, "Assistive Communication Selected", Toast.LENGTH_SHORT).show()
        }
        moneyDetectionBtn.setOnClickListener {
            Toast.makeText(this, "Money Detection Selected", Toast.LENGTH_SHORT).show()
        }

        navigationAssistantBtn.setOnClickListener {
            Toast.makeText(this, "Navigation Assistant Selected", Toast.LENGTH_SHORT).show()
        }

        transportationBtn.setOnClickListener {
            Toast.makeText(this, "Transportation Selected", Toast.LENGTH_SHORT).show()
        }

        micBtn.setOnClickListener {
        }

        backspaceBtn.setOnClickListener {
        }

        emergencyBtn.setOnClickListener {
            Toast.makeText(this, "Emergency", Toast.LENGTH_SHORT).show()
        }

        homeBtn.setOnClickListener {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
        }

        settingsBtn.setOnClickListener {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
        }

        }
    }

