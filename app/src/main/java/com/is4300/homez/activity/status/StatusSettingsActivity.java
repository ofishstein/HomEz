package com.is4300.homez.activity.status;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.is4300.homez.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StatusSettingsActivity extends AppCompatActivity {

    @BindView(R.id.saveButton)
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_settings);
        ButterKnife.bind(this);
        setOnClickListener();
    }

    private void setOnClickListener(){
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
