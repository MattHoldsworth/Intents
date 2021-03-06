package com.example.matt.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Activity2.class);

        final EditText applesInput = findViewById(R.id.applesInput);
        String userMessage = applesInput.getText().toString();
        i.putExtra("appleMessage", userMessage);

        startActivity(i);
    }
}
