package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView1 = findViewById(R.id.extratext1);
        TextView textView2 = findViewById(R.id.extratext2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String extraMessage = extras.getString("Message");
            String extraDate = extras.getString("Date");
            textView1.setText(extraMessage);
            textView2.setText(extraDate);
        }
    }

}