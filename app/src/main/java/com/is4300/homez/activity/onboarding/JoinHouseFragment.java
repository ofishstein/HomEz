package com.is4300.homez.activity.onboarding;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.is4300.homez.R;
import com.is4300.homez.activity.DashboardActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class JoinHouseFragment extends Fragment {

    @BindView(R.id.doneJoinButton)
    Button doneButton;
    @BindView(R.id.houseId)
    EditText houseIdEditText;

    public JoinHouseFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment JoinHouseFragment.
     */
    public static JoinHouseFragment newInstance() {
        JoinHouseFragment fragment = new JoinHouseFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_join_house, container, false);
        ButterKnife.bind(this, view);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
