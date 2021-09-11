package com.example.agedatabase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DeleteFragment extends Fragment {
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.content_delete, container, false);

		final DataManager dm = new DataManager(getActivity());
		Button btnDelete = v.findViewById(R.id.btnDelete);

		final EditText editDelete = v.findViewById(R.id.editDelete);
		btnDelete.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dm.delete(editDelete.getText().toString());
			}
		});

		return v;
	}
}
