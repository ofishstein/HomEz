package com.is4300.homez.activity.chore;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.is4300.homez.managers.ChoreManager;

/**
 * Created by ianleonard on 2/27/18.
 */

public class ChorePagerAdapter extends FragmentPagerAdapter {

    public ChorePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return MyChoresFragment.newInstance(ChoreManager.getChoreManagerInstance());
        } else {
            return AllChoresFragment.newInstance(ChoreManager.getChoreManagerInstance());
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
