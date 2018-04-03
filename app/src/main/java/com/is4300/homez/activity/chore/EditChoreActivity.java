package com.is4300.homez.activity.chore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import com.is4300.homez.R;
import com.is4300.homez.activity.settings.PersonalSettingsActivity;
import com.is4300.homez.model.Chore;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EditChoreActivity extends AppCompatActivity {

    @BindView(R.id.editChoreTitle)
    EditText choreTitle;

    @BindView(R.id.assigneeSpinner)
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

        choreTitle.setText(chore.getName());
        //assigneeSpinner.setSelection(arraySpinner.getPosition(chore.getAssignee()));
        dateSpinner.updateDate(chore.getDueYear(), chore.getDueMo(), chore.getDueDay());
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chore.editChore(choreTitle.getText().toString(), dateSpinner.getDayOfMonth(), dateSpinner.getMonth(), dateSpinner.getYear());

                Intent intent = new Intent(getApplicationContext(), ChoreActivity.class);
                startActivity(intent);
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chore.deleteChore(choreList);

                Intent intent = new Intent(getApplicationContext(), ChoreActivity.class);
                startActivity(intent);
            }
        });
    }


}
