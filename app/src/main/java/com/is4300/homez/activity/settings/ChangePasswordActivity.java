package com.is4300.homez.activity.settings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.is4300.homez.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by crouan on 3/1/18.
 */

public class ChangePasswordActivity  extends AppCompatActivity {
    @BindView(R.id.settings_currPwd)
    EditText settings_currPwd;
    @BindView(R.id.settings_newPwd)
    EditText settings_newPwd;
    @BindView(R.id.settings_cnewPwd)
    EditText settings_cnewPwd;
    @BindView(R.id.settings_savePwdButton)
    Button settings_savePwdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        ButterKnife.bind(this);
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        settings_savePwdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PersonalSettingsActivity.class);
                startActivity(intent);
            }
        });
    }

}
