package com.is4300.homez.activity.chore;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.is4300.homez.HomEzApp;
import com.is4300.homez.R;
import com.is4300.homez.activity.adapters.ChorePagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChoreActivity extends AppCompatActivity {
    @BindView(R.id.choreViewPager)
    ViewPager choreViewPager;
    @BindView(R.id.choreTabLayout)
    TabLayout choreTabLayout;

    private ChorePagerAdapter chorePagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chore);
        ButterKnife.bind(this);

        this.chorePagerAdapter = new ChorePagerAdapter(getSupportFragmentManager(), ((HomEzApp) getApplicationContext()).choreManager);
        this.choreViewPager.setAdapter(chorePagerAdapter);
        this.choreViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(choreTabLayout));
        this.choreTabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(choreViewPager));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_add, menu);
    return true;
}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.addMenu) {
            Intent intent = new Intent(this, AddChoreActivity.class);
            startActivity(intent);

        }
        return true;
    }
}


/*
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import com.is4300.homez.R;
import com.is4300.homez.model.RoommateModel;

import java.text.SimpleDateFormat;

public class ChoreActivity extends Activity {
    ListView lv;
    ChoreModel[] modelItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_chore);
        lv = findViewById(R.id.all_list);

        modelItems = new ChoreModel[5];
        modelItems[0] = new ChoreModel("Clean Room", 0, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));
        modelItems[1] = new ChoreModel("Empty Dishwasher", 1, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));
        modelItems[2] = new ChoreModel("Swab the Poopdeck", 1, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));
        modelItems[3] = new ChoreModel("Buy Toilet Paper", 0, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));
        modelItems[4] = new ChoreModel("Take Out Trash", 1, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));

        ChoreAdapter adapter = new ChoreAdapter(this, modelItems);
        lv.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
        return true;
    }
}*/