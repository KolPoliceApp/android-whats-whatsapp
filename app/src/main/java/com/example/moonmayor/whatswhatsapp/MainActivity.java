package com.example.moonmayor.whatswhatsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.moonmayor.whatswhatsapp.adapters.ConversationsAdapter;
import com.example.moonmayor.whatswhatsapp.mockdata.MockConversations;
import com.example.moonmayor.whatswhatsapp.models.ChatConversation;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView usernameTextView;

    private ListView mConversationsListView;
    private ArrayAdapter<ChatConversation> mConversationsAdapter;

    private String mUsername;

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

            // prevent the app from doing anything else if it's launching the Login activity.
            return;
        } else {
            usernameTextView = (TextView) findViewById(R.id.usernameDisplay);
            mUsername = (String) intent.getExtras().get("username");
            usernameTextView.setText(mUsername);
        }

        attachConversations();
    }

    private void attachConversations() {
        List<ChatConversation> conversations = MockConversations.allConversations;
        mConversationsAdapter = new ConversationsAdapter(this, R.layout.chat_conversation, conversations);
        mConversationsListView = (ListView) findViewById(R.id.conversations);
        mConversationsListView.setAdapter(mConversationsAdapter);
    }
}
