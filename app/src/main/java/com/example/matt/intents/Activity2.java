package com.example.matt.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Bundle applesData = getIntent().getExtras();
        if(applesData == null) {
            return;
        }
        String appleMessage = applesData.getString("appleMessage");
        final TextView orangesText = findViewById(R.id.orangesText);
        orangesText.setText(appleMessage);
    }

    public void onClick(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
