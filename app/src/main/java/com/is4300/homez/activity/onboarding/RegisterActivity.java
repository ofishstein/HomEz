package com.is4300.homez.activity.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.is4300.homez.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.firstName)
    EditText firstNameEditText;
    @BindView(R.id.lastName)
    EditText lastNameEditText;
    @BindView(R.id.email)
    EditText emailEditText;
    @BindView(R.id.password)
    EditText passwordEditText;
    @BindView(R.id.confirmPassword)
    EditText confirmPasswordEditText;
    @BindView(R.id.continueButton)
    Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HouseActivity.class);
                startActivity(intent);
            }
        });
    }

}
