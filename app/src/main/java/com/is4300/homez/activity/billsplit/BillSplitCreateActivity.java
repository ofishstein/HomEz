package com.is4300.homez.activity.billsplit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.is4300.homez.R;
import com.is4300.homez.activity.DashboardActivity;
import com.is4300.homez.activity.onboarding.RegisterActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by tuiolosega.a on 2/28/18.
 */


public class BillSplitCreateActivity extends AppCompatActivity {

    @BindView(R.id.billSplitTabLayout)
    TabLayout chargeOrPayTab;
    @BindView(R.id.billSplitCompleteButton)
    Button completeButton;

    String tabMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_split_create);
        ButterKnife.bind(this);

        chargeOrPayTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // this should be a class variable
                tabMode = (String) tab.getText();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //LEAVE BLANK
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                //LEAVE BLANK
            }
        });

        setOnClickListeners();

    }

    private void setOnClickListeners() {
        this.completeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BillSplitActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }



}

