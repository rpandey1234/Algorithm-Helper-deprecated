package edu.stanford.rkpandey;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TopicListAdapter extends ArrayAdapter<TopicRecord> {
    private ArrayList<TopicRecord> topics;

    public TopicListAdapter(Context context, int textViewResourceId, ArrayList<TopicRecord> topics) {
        super(context, textViewResourceId, topics);
        this.topics = topics;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.item_listing, null);
        }
      
        TopicRecord topic = topics.get(position);
        if (topic != null) {
        	ImageView avatar = (ImageView) v.findViewById(R.id.avatar);
        	TextView username = (TextView) v.findViewById(R.id.title);
            TextView email = (TextView) v.findViewById(R.id.description);

            if (username != null) {
            	username.setText(topic.topic);
            }
	
            if (email != null) {
            	email.setText(topic.subtopics);
            }
            if (avatar != null) {
            	avatar.setImageResource(topic.image);
            }
	  }
	  return v;
    }
}
