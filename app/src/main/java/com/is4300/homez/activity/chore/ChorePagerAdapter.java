package com.is4300.homez.activity.chore;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

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
            return MyChoresFragment.newInstance();
        } else {
            return AllChoresFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
