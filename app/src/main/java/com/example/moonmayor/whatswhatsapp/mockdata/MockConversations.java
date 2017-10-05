package com.example.moonmayor.whatswhatsapp.mockdata;

import com.example.moonmayor.whatswhatsapp.models.ChatMessage;
import com.example.moonmayor.whatswhatsapp.models.ChatConversation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by moonmayor on 10/4/17.
 */

public class MockConversations {
    public static List<String> participants = new ArrayList<>();

    public static ChatMessage chat1 = new ChatMessage("Alice", "Hey Bob, I have something to tell you.");
    public static ChatMessage chat2 = new ChatMessage("Bobby", "OK, tell me!");
    public static ChatMessage chat3 = new ChatMessage("Alice", "We have to be careful. It's a secret.");
    public static ChatMessage chat4 = new ChatMessage("Bobby", "Hmm. I'm not sure how to send secrets.");
    public static ChatMessage chat5 = new ChatMessage("Alice", "lol");
    public static ChatMessage chat6 = new ChatMessage("Bobby", "lol");
    public static ChatMessage chat7 = new ChatMessage("Alice", "lol");
    public static ChatMessage chat8 = new ChatMessage("Bobby", "lol");
    public static ChatMessage chat9 = new ChatMessage("Alice", "lol");
    public static ChatMessage chat10 = new ChatMessage("Bobby", "lol");
    public static ChatMessage chat11 = new ChatMessage("Alice", "lol");
    public static ChatMessage chat12 = new ChatMessage("Bobby", "lol");

    public static List<ChatMessage> emptyConvoMessages = new ArrayList<>();
    public static List<ChatMessage> shortConvoMessages = new ArrayList<>();
    public static List<ChatMessage> longConvoMessages = new ArrayList<>();

    public static ChatConversation emptyConversation;
    public static ChatConversation shortConversation;
    public static ChatConversation longConversation;

    static {
        participants.add("Alice");
        participants.add("Bobby");

        emptyConversation = new ChatConversation("Empty Convo", participants, emptyConvoMessages);

        shortConvoMessages.add(chat1);
        shortConvoMessages.add(chat2);
        shortConvoMessages.add(chat3);
        shortConversation = new ChatConversation("Short Convo", participants, shortConvoMessages);

        longConvoMessages.add(chat1);
        longConvoMessages.add(chat2);
        longConvoMessages.add(chat3);
        longConvoMessages.add(chat4);
        longConvoMessages.add(chat5);
        longConvoMessages.add(chat6);
        longConvoMessages.add(chat7);
        longConvoMessages.add(chat8);
        longConvoMessages.add(chat9);
        longConvoMessages.add(chat10);
        longConvoMessages.add(chat11);
        longConvoMessages.add(chat12);
        longConversation = new ChatConversation("Long Convo", participants, longConvoMessages);
    }
}
