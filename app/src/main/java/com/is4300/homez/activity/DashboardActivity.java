package com.is4300.homez.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.is4300.homez.R;
import com.is4300.homez.activity.billsplit.BillSplitActivity;
import com.is4300.homez.activity.calendar.CalendarActivity;
import com.is4300.homez.activity.chore.ChoreActivity;
import com.is4300.homez.activity.settings.SettingsActivity;
import com.is4300.homez.activity.status.StatusActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DashboardActivity extends AppCompatActivity {

    @BindView(R.id.billSplitModule)
    View billSplitModule;
    @BindView(R.id.calendarModule)
    View calendarModule;
    @BindView(R.id.statusModule)
    View statusModule;
    @BindView(R.id.choreModule)
    View choreModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);
        setOnClickListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if( item.getItemId() == R.id.settingsMenu) {
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);

        }

        return true;
    }

    private void setOnClickListeners() {
        this.billSplitModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BillSplitActivity.class);
                startActivity(intent);
            }
        });

        this.calendarModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CalendarActivity.class);
                startActivity(intent);
            }
        });

        this.statusModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StatusActivity.class);
                startActivity(intent);
            }
        });

        this.choreModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChoreActivity.class);
                startActivity(intent);
            }
        });
    }
}
