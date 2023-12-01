package com.example.overnightapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class ArrayActivity extends Activity {

    TextInputLayout textInputLayout;
    AutoCompleteTextView autoCompleteTextView;
    TextView showdong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        textInputLayout = findViewById(R.id.inputLayout);
        autoCompleteTextView = findViewById(R.id.dong);
        showdong = findViewById(R.id.showdong);

        String[] items = {"A동", "B동", "103동", "104동"};
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(ArrayActivity.this,
                R.layout.item_list, items);
        autoCompleteTextView.setAdapter(itemAdapter);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                showdong.setText((String) adapterView.getItemAtPosition(position));

            }
        });
    }
}
