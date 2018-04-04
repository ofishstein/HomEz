package com.is4300.homez.activity.chore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.is4300.homez.HomEzApp;
import com.is4300.homez.R;
import com.is4300.homez.model.Chore;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EditChoreActivity extends AppCompatActivity {

    String[] spinnerNames;
    String assignee;


    @BindView(R.id.editChoreTitle)
    EditText choreTitle;

    @BindView(R.id.editAssigneeSpinner)
    Spinner assigneeSpinner;

    @BindView(R.id.datePicker)
    DatePicker dateSpinner;

    @BindView(R.id.saveButton)
    Button saveButton;

    @BindView(R.id.deleteButton)
    Button deleteButton;

    Chore chore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        chore = (Chore) getIntent().getSerializableExtra("chore");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_chore);
        ButterKnife.bind(this);

        this.spinnerNames = ((HomEzApp) getApplicationContext()).spinnerNames;

        choreTitle.setText(chore.getName());
        //assigneeSpinner.setSelection(arraySpinner.getPosition(chore.getAssignee()));
        dateSpinner.updateDate(chore.getDueYear(), chore.getDueMo(), chore.getDueDay());


        setOnClickListeners();
        setUpSpinner();
    }

    private void setOnClickListeners() {
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chore.editChore(choreTitle.getText().toString(), assignee, dateSpinner.getDayOfMonth(), dateSpinner.getMonth(), dateSpinner.getYear());
                ((HomEzApp) getApplicationContext()).choreManager.updateMockChores(chore);
                Intent intent = new Intent(getApplicationContext(), ChoreActivity.class);
                startActivity(intent);
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((HomEzApp) getApplicationContext()).choreManager.deleteMockChore(chore);
                Intent intent = new Intent(getApplicationContext(), ChoreActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setUpSpinner() {
        //Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, spinnerNames);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        assigneeSpinner.setAdapter(arrayAdapter);
        assignee = assigneeSpinner.getSelectedItem().toString();


        //TODO this doesn't work, doesn't set the spinner to the proper assignee
        if (chore.getAssignee() != null) {
            int spinnerPosition = arrayAdapter.getPosition(chore.getAssignee());
            assigneeSpinner.setSelection(spinnerPosition);
        }

        assigneeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
