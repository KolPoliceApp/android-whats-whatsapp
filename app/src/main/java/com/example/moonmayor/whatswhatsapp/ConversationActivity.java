package com.example.moonmayor.whatswhatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by moonmayor on 10/6/17.
 */

public class ConversationActivity extends AppCompatActivity {
    public static final String EXTRA_TITLE = "TITLE";

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);

        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null || intent.getExtras().get(EXTRA_TITLE) == null) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        String title = intent.getExtras().getString(EXTRA_TITLE, "Untitled");
        mTextView = (TextView) findViewById(R.id.title);
        mTextView.setText(title);
    }
}
