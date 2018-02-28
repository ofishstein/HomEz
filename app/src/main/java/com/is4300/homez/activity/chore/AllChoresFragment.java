package com.is4300.homez.activity.chore;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.is4300.homez.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AllChoresFragment extends Fragment {

    @BindView(R.id.all_chores_list)
    ListView all_chores_list;


    public AllChoresFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment JoinHouseFragment.
     */
    public static AllChoresFragment newInstance() {
        AllChoresFragment fragment = new AllChoresFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all_chores, container, false);
        ButterKnife.bind(this, view);

        return view;
    }
}
