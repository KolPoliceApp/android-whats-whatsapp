package com.example.moonmayor.whatswhatsapp.adapters;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.moonmayor.whatswhatsapp.R;
import com.example.moonmayor.whatswhatsapp.models.ChatConversation;

import java.util.List;

/**
 * Created by moonmayor on 10/4/17.
 */

public class ConversationsAdapter extends ArrayAdapter<ChatConversation> {
    private Context mContext;
    private List<ChatConversation> mConversations;

    public class ViewHolder {
        public TextView mConversationName;

        public ChatConversation mConversation;

        public ViewHolder(View view, ChatConversation conversation) {
            this.mConversation = conversation;

            this.mConversationName = view.findViewById(R.id.conversationName);
            this.mConversationName.setText(conversation.title);
        }
    }

    public ConversationsAdapter(Context context, int resource, List<ChatConversation> conversations) {
        super(context, resource, conversations);
        mContext = context;
        mConversations = conversations;
    }

    @Override
    public int getCount() {
        return mConversations.size();
    }

    @Nullable
    @Override
    public ChatConversation getItem(int position) {
        return mConversations.get(position);
    }

    @Override
    public boolean isEmpty() {
        return this.getCount() == 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.chat_conversation, parent, false);
        }

        ViewHolder holder = new ViewHolder(convertView, this.getItem(position));

        return convertView;
    }
}
