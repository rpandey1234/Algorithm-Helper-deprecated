package edu.stanford.rkpandey;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class AlgorithmHelperActivity extends ListActivity {
    /** Called when the activity is first created. */

	public static String ACTIVITY_LOG = "Activities log";
	
	/**
	 * Need to add corresponding activity for the topic
	 */
	ArrayList<TopicRecord> topics;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /** The below line somehow gets rid of the list and only displays the info text :(*/
        //this.setContentView(R.layout.main);
        topics = TopicRecord.getItems();
        
        //topics = getResources().getStringArray(R.array.topics_array);
        ListView lstView = getListView();
        lstView.setTextFilterEnabled(true);
        setListAdapter(new TopicListAdapter(this, R.layout.item_listing, topics));
    }
	
	public void onListItemClick(ListView parent, View v, int position, long id) {
		super.onListItemClick(parent, v, position, id);
		TopicRecord topic = topics.get(position);
		Toast.makeText(this, "You've selected " + topic.topic, Toast.LENGTH_LONG).show();
		Intent intent = new Intent(this, topic.cls);
		startActivity(intent);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.general_menu, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case R.id.about:
	    	// Create dialog to show info
	    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    	builder.setMessage("Questions/Comments? Email rpandey1234@gmail.com. \n\n " +
	    			"Material compiled from CS161 (notes by Moor Xu), CS106B, and other sources.")
	    	       .setNeutralButton("OK", new DialogInterface.OnClickListener() {
	    	           public void onClick(DialogInterface dialog, int id) {}
	    	       });
	    	AlertDialog alert = builder.create();
	    	alert.show();
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
	
}