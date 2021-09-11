package com.example.agedatabase;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ResultsFragment extends Fragment {
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.content_results, container, false);
		// Create an instance of our DataManager
		DataManager dm = new DataManager(getActivity());
		// Get a reference to the TextView to show the results
		TextView textResults = v.findViewById(R.id.textResults);
		// Create and initialize a Cursor with all the results
		Cursor c = dm.selectAll();
		// A String to hold all the text
		String list = "";
		// Loop through the results in the Cursor
		while (c.moveToNext()){
			// Add the results to the String
			// with a little formatting
			list+=(c.getString(1) + " - " + c.getString(2) + "\n");
		}
// Display the String in the TextView
		textResults.setText(list);
		return v;
	}
}
