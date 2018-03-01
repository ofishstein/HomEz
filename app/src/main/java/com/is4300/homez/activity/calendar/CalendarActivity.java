package com.is4300.homez.activity.calendar;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.is4300.homez.HomEzApp;
import com.is4300.homez.R;
import com.is4300.homez.activity.adapters.DashEventArrayAdapter;
import com.is4300.homez.model.EventMock;
import com.is4300.homez.util.UiUtils;

import java.util.List;

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

        //setUpEventList();

        this.calPagerAdapter = new CalendarPagerAdapter(getSupportFragmentManager());
        this.calViewPager.setAdapter(calPagerAdapter);
        this.calViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(calTabLayout));
        this.calTabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(calViewPager));
    }


}