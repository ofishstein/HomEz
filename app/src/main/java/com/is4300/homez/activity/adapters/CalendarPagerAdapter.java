package com.is4300.homez.activity.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.is4300.homez.activity.calendar.DayFragment;
import com.is4300.homez.activity.calendar.MonthFragment;
import com.is4300.homez.managers.CalendarManager;


/**
 * Created by izzitripp on 2/28/18.
 */

public class CalendarPagerAdapter extends FragmentPagerAdapter {

    private CalendarManager calManager;

    public CalendarPagerAdapter(FragmentManager fm, CalendarManager calM) {
        super(fm);
        this.calManager = calM;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return DayFragment.newInstance(calManager);
        } else {
            return MonthFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
