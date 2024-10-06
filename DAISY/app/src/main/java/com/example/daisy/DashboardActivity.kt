package com.example.daisy

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.daisy.databinding.DashboardBinding // Import your generated binding class

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: DashboardBinding // Declare the binding variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DashboardBinding.inflate(layoutInflater) // Inflate the binding
        setContentView(binding.root) // Set the content view to the root of the binding

        // Initialize buttons using binding
        val assistiveCommBtn: Button = binding.assistiveCommunicationBtn
        val moneyDetectionBtn: Button = binding.moneyDetectionBtn
        val navigationAssistantBtn: Button = binding.navigationAssistantBtn
        val transportationBtn: Button = binding.transportationBtn
//        val voiceCommandBtn: Button = binding.voiceBtn
//        val emergencyBtn: ImageButton = binding.emergencyBtn
//        val homeBtn: ImageButton = binding.homeBtn
//        val settingsBtn: ImageButton = binding.settingsBtn

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
//        voiceCommandBtn.setOnClickListener {
//            Toast.makeText(this, "Voice Command Activated", Toast.LENGTH_SHORT).show()
//        }
//        emergencyBtn.setOnClickListener {
//            Toast.makeText(this, "Emergency", Toast.LENGTH_SHORT).show()
//        }
//        homeBtn.setOnClickListener {
//            // Handle home button click
//        }
//        settingsBtn.setOnClickListener {
//            // Handle settings button click
//        }
    }
}
