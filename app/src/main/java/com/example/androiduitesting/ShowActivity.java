package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        // Get the city name passed from MainActivity
        String cityName = getIntent().getStringExtra("CITY_NAME");

        // Display city name
        TextView textViewCity = findViewById(R.id.text_city_name);
        textViewCity.setText(cityName);

        // Back button goes back to MainActivity
        Button backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // closes ShowActivity and returns to MainActivity
            }
        });
    }
}
