package com.is4300.homez.activity.calendar;

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

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalendarActivity extends AppCompatActivity {

    @BindView(R.id.calViewPager)
    ViewPager calViewPager;
    @BindView(R.id.calTabLayout)
    TabLayout calTabLayout;

    private CalendarPagerAdapter calPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        ButterKnife.bind(this);

        this.calPagerAdapter = new CalendarPagerAdapter(getSupportFragmentManager(), ((HomEzApp) getApplicationContext()).calendarManager);
        this.calViewPager.setAdapter(calPagerAdapter);
        this.calViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(calTabLayout));
        this.calTabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(calViewPager));
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
            Intent intent = new Intent(this, AddEventActivity.class);
            startActivity(intent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}