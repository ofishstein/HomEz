package com.is4300.homez.activity.chore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.is4300.homez.HomEzApp;
import com.is4300.homez.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ianleonard on 2/28/18.
 */

public class AddChoreActivity extends AppCompatActivity {

    String[] spinnerNames;

    @BindView(R.id.saveButton)
    Button saveButton;
    @BindView(R.id.assigneeSpinner)
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_chore);
        ButterKnife.bind(this);
        this.spinnerNames = ((HomEzApp) getApplicationContext()).spinnerNames;
        setOnClickListener();
        setUpSpinner();
    }

    private void setOnClickListener(){
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void setUpSpinner() {
        //Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, spinnerNames);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), spinnerNames[position], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}
