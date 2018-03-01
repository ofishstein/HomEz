package com.is4300.homez.activity.status;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import com.is4300.homez.HomEzApp;
import com.is4300.homez.R;
import com.is4300.homez.activity.adapters.StatusArrayAdapter;
import com.is4300.homez.model.Status;
import com.is4300.homez.util.UiUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class StatusActivity extends AppCompatActivity {
    @BindView(R.id.statusList)
    ListView statusListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        ButterKnife.bind(this);
        setUpStatusList();
    }

    private void setUpStatusList() {
        List<Status> statuses = ((HomEzApp) getApplicationContext()).statusManager.mockStatusList;
        StatusArrayAdapter arrayAdapter = new StatusArrayAdapter(this, R.layout.item_user_status, statuses);
        statusListView.setAdapter(arrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.settingsMenu) {
            Intent intent = new Intent(this, StatusSettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
