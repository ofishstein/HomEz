package com.is4300.homez.activity.calendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.is4300.homez.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by izzitripp on 2/28/18.
 */

public class AddEventActivity extends AppCompatActivity  {

    @BindView(R.id.continueButton)
    Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);
        ButterKnife.bind(this);
        setOnClickListener();
    }

    private void setOnClickListener(){
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
