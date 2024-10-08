package com.example.daisy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.daisy.databinding.DashboardBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: DashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout using View Binding
        binding = DashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //Navigation button
        val navButton: Button = findViewById(R.id.navigation_assistant_btn)

        // Set onClickListeners using the binding object
        binding.assistiveCommunicationBtn.setOnClickListener {
            Toast.makeText(this, "Assistive Communication Selected", Toast.LENGTH_SHORT).show()
        }

        binding.moneyDetectionBtn.setOnClickListener {
            Toast.makeText(this, "Money Detection Selected", Toast.LENGTH_SHORT).show()
        }

        binding.navigationAssistantBtn.setOnClickListener {
            Toast.makeText(this, "Navigation Assistant Selected", Toast.LENGTH_SHORT).show()
            // Start the NavigationAssistActivity
            val intent = Intent(this, NavigationAssistActivity::class.java)
            startActivity(intent)
        }

        binding.transportationBtn.setOnClickListener {
            Toast.makeText(this, "Transportation Selected", Toast.LENGTH_SHORT).show()
        }

        binding.micBtn.setOnClickListener {
            Toast.makeText(this, "Voice Command Activated", Toast.LENGTH_SHORT).show()
        }

        binding.emergencyBtn.setOnClickListener {
            Toast.makeText(this, "Emergency", Toast.LENGTH_SHORT).show()
        }

        binding.homeBtn.setOnClickListener {
        }

        binding.settingsBtn.setOnClickListener {
        }
    }
}
