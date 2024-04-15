package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define the button and set its onClickListener inside onCreate method
        Button secondActivityButton = findViewById(R.id.button);
        secondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the second activity
                Intent intent = new Intent(MainActivity.this, Second_Activity.class);
                intent.putExtra("Message", "Hello this is data");
                intent.putExtra("Date", "15042024");
                startActivity(intent);
            }
        });
    }
}