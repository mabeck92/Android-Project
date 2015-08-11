package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;

import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

        ParseObject testObject = new ParseObject("Fragen");
        testObject.put("Frage" , "Wie heißt");
        testObject.put("A" , "JPEG");
        testObject.saveInBackground();


		ParseAnalytics.trackAppOpenedInBackground(getIntent());
	}
}
