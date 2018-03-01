package com.is4300.homez.activity.settings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.is4300.homez.R;
import com.is4300.homez.activity.DashboardActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PersonalSettingsActivity extends AppCompatActivity {

    @BindView(R.id.settings_firstName)
    EditText settings_firstNameEditText;
    @BindView(R.id.settings_lastName)
    EditText settings_lastNameEditText;
    @BindView(R.id.settings_email)
    EditText settings_emailEditText;
    @BindView(R.id.pwd_Button)
    Button pwd_Button;
    @BindView(R.id.settings_saveButton)
    Button settings_saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        settings_saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
            }
        });

        pwd_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChangePasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}
