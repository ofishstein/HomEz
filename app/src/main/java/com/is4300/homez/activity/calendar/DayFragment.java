package com.is4300.homez.activity.calendar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.is4300.homez.R;

import butterknife.ButterKnife;

/**
 * Created by izzitripp on 2/28/18.
 */

public class DayFragment extends Fragment {

    public DayFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment DayFragment.
     */
    public static DayFragment newInstance() {
        DayFragment fragment = new DayFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_day_view, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

}
