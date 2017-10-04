package com.example.moonmayor.whatswhatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by moonmayor on 10/4/17.
 */

public class LoginActivity extends AppCompatActivity {
    EditText mUsernameInput;
    Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsernameInput = (EditText) findViewById(R.id.usernameInput);
        mLoginButton = (Button) findViewById(R.id.loginButton);
        attachClickHandlers();
    }

    private void attachClickHandlers() {
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mUsernameInput.getText().toString();
                initiateLogin(username);
            }
        });
    }

    private void initiateLogin(String username) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        intent.putExtra("username", username);
        startActivity(intent);
    }
}

