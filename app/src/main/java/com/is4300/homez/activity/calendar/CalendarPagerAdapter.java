package com.is4300.homez.activity.calendar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by izzitripp on 2/28/18.
 */

public class CalendarPagerAdapter extends FragmentPagerAdapter {

    public CalendarPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return DayFragment.newInstance();
        } else if (position == 1) {
            return WeekFragment.newInstance();
        } else {
            return MonthFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
