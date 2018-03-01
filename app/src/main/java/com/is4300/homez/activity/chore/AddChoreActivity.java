package com.is4300.homez.activity.chore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.is4300.homez.R;

import butterknife.ButterKnife;

/**
 * Created by ianleonard on 2/28/18.
 */

public class AddChoreActivity extends AppCompatActivity {

    //@BindView(R.id.addButton)
    //Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_chore);
        ButterKnife.bind(this);
        //setOnClickListener();
    }
/*
    private void setOnClickListener(){
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    */
}
