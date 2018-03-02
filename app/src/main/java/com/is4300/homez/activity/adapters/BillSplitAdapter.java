package com.is4300.homez.activity.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ArrayAdapter;

import com.is4300.homez.activity.billsplit.BillSplitActivity;

/**
 * Created by tuiolosega.a on 2/28/18.
 */

public class BillSplitAdapter extends ArrayAdapter<BillSplitActivity> {


    public BillSplitAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @Override
    public int getCount() {
        return 0;
    }





}
