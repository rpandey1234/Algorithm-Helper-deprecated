package edu.stanford.rkpandey;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class SortingActivity extends TabActivity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.detail);

	    Resources res = getResources(); // Resource object to get Drawables
	    TabHost tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
	    Intent intent;  // Reusable Intent for each tab

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    intent = new Intent().setClass(this, SortingOActivity.class);

	    // Initialize a TabSpec for each tab and add it to the TabHost
	    spec = tabHost.newTabSpec("overview").setIndicator("Overview",
                res.getDrawable(R.drawable.ic_tab_overview))
            .setContent(intent);
	    tabHost.addTab(spec);

	    // Do the same for the other tabs
	    intent = new Intent().setClass(this, SortingQActivity.class);
	    spec = tabHost.newTabSpec("questions").setIndicator("Questions",
	    		res.getDrawable(R.drawable.ic_tab_questions))
	    		.setContent(intent);
	    tabHost.addTab(spec);

	    //tabHost.setCurrentTab(1);
	}
}
