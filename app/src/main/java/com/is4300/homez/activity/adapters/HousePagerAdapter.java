package com.is4300.homez.activity.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.is4300.homez.activity.onboarding.JoinHouseFragment;
import com.is4300.homez.activity.onboarding.NewHouseFragment;

/**
 * Created by ofishstein on 2/27/18.
 */

public class HousePagerAdapter extends FragmentPagerAdapter {

    public HousePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return NewHouseFragment.newInstance();
        } else {
            return JoinHouseFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
