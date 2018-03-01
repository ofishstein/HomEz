package com.is4300.homez.activity.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.is4300.homez.activity.chore.AllChoresFragment;
import com.is4300.homez.activity.chore.MyChoresFragment;
import com.is4300.homez.managers.ChoreManager;

/**
 * Created by ianleonard on 2/27/18.
 */

public class ChorePagerAdapter extends FragmentPagerAdapter {

    ChoreManager choreManager;

    public ChorePagerAdapter(FragmentManager fm, ChoreManager choreManager) {
        super(fm);
        this.choreManager = choreManager;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return MyChoresFragment.newInstance(choreManager);
        } else {
            return AllChoresFragment.newInstance(choreManager);
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
