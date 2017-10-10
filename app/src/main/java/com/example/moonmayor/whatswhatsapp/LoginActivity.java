package com.example.moonmayor.whatswhatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
                initiateLogin();
            }
        });

        mUsernameInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                Log.d("PRESS", "" + keyEvent.getKeyCode());
                // detect if the user presses [enter]
                if (keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    initiateLogin();
                    return true;
                }
                return false;
            }
        });
    }

    private void initiateLogin() {
        String username = mUsernameInput.getText().toString();
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        intent.putExtra("username", username);
        startActivity(intent);
    }
}

