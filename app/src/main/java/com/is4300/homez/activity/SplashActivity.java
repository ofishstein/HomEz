package com.is4300.homez.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.is4300.homez.R;
import com.is4300.homez.activity.onboarding.LoginActivity;

/***
 * Manages state and variables that are needed throughout the app across all activities.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        selectStartActivity();
    }

    private void selectStartActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

}
