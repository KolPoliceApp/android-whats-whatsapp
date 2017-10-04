package com.example.moonmayor.whatswhatsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView usernameTextView;

    String mUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this activity must be started with an intent passing a username.
        // redirect the user to the LoginActivity if no intent or username is present.
        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null) {
            Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(loginIntent);
        } else {
            usernameTextView = (TextView) findViewById(R.id.usernameDisplay);
            mUsername = (String) intent.getExtras().get("username");
            usernameTextView.setText(mUsername);
        }
    }
}
