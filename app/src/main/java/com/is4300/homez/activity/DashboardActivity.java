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
import com.is4300.homez.activity.adapters.DashEventArrayAdapter;
import com.is4300.homez.activity.adapters.StatusArrayAdapter;
import com.is4300.homez.activity.billsplit.BillSplitActivity;
import com.is4300.homez.activity.calendar.CalendarActivity;
import com.is4300.homez.activity.chore.ChoreActivity;
import com.is4300.homez.activity.onboarding.LoginActivity;
import com.is4300.homez.activity.settings.HomeSettingsActivity;
import com.is4300.homez.activity.settings.LegalActivity;
import com.is4300.homez.activity.settings.PersonalSettingsActivity;
import com.is4300.homez.activity.status.StatusActivity;
import com.is4300.homez.model.Chore;
import com.is4300.homez.model.EventMock;
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
    @BindView(R.id.eventList)
    ListView eventListView;

    String activeUserMock = new String("Ian Leonard");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);
        setUpStatusList();
        setUpChoreList();
        setUpEventList();
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
        Intent intent;

        switch (item.getItemId()) {
            case R.id.personalSettings:
                intent = new Intent(this, PersonalSettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.houseSettings:
                intent = new Intent(this, HomeSettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.legal:
                intent = new Intent(this, LegalActivity.class);
                startActivity(intent);
                break;
            case R.id.signOut:
                intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
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
        List<Chore> chores = ((HomEzApp) getApplicationContext()).choreManager.getMyUpcomingChores(activeUserMock);
        DashChoreArrayAdapter arrayAdapter = new DashChoreArrayAdapter(this, R.layout.item_dash_chore, chores);
        choreListView.setAdapter(arrayAdapter);
        UiUtils.setListViewHeightBasedOnItems(choreListView);
    }

    private void setUpEventList() {
        List<EventMock> events = ((HomEzApp) getApplicationContext()).calendarManager.mockEventsList;
        DashEventArrayAdapter arrayAdapter = new DashEventArrayAdapter(this, R.layout.item_dash_calendar_event, events);
        eventListView.setAdapter(arrayAdapter);
        UiUtils.setListViewHeightBasedOnItems(eventListView);
    }

    private void setUpAccountBalance() {}


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
