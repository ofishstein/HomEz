package com.is4300.homez.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.is4300.homez.HomEzApp;
import com.is4300.homez.R;
import com.is4300.homez.activity.adapters.DashChoreArrayAdapter;
import com.is4300.homez.activity.adapters.StatusArrayAdapter;
import com.is4300.homez.activity.billsplit.BillSplitActivity;
import com.is4300.homez.activity.calendar.CalendarActivity;
import com.is4300.homez.activity.chore.ChoreActivity;
import com.is4300.homez.activity.settings.SettingsActivity;
import com.is4300.homez.activity.status.StatusActivity;
import com.is4300.homez.model.Chore;
import com.is4300.homez.model.Status;
import com.is4300.homez.util.UiUtils;

import java.util.List;

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
    @BindView(R.id.statusList)
    ListView statusListView;
    @BindView(R.id.choreList)
    ListView choreListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);
        setUpStatusList();
        setUpChoreList();
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

    private void setUpStatusList() {
        List<Status> statuses = ((HomEzApp) getApplicationContext()).statusManager.getHomeUsers();
        StatusArrayAdapter arrayAdapter = new StatusArrayAdapter(this, R.layout.item_user_status, statuses);
        statusListView.setAdapter(arrayAdapter);
        UiUtils.setListViewHeightBasedOnItems(statusListView);
    }

    private void setUpChoreList() {
        List<Chore> chores = ((HomEzApp) getApplicationContext()).choreManager.getUpcomingChores();
        DashChoreArrayAdapter arrayAdapter = new DashChoreArrayAdapter(this, R.layout.item_dash_chore, chores);
        choreListView.setAdapter(arrayAdapter);
        UiUtils.setListViewHeightBasedOnItems(choreListView);
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
