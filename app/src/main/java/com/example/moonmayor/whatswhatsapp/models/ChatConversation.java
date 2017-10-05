package com.example.moonmayor.whatswhatsapp.models;

import java.util.List;

/**
 * Created by moonmayor on 10/4/17.
 */

public class ChatConversation {
    private final String title;
    private final List<ChatMessage> messages;
    private final List<String> participants;

    public ChatConversation(String title, List<String> participants, List<ChatMessage> messages) {
        this.title = title;
        this.participants = participants;
        this.messages = messages;
    }
}
