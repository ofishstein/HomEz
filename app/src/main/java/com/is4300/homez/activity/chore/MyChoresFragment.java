package com.is4300.homez.activity.chore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.is4300.homez.HomEzApp;
import com.is4300.homez.R;
import com.is4300.homez.activity.adapters.MyChoreAdapter;
import com.is4300.homez.managers.ChoreManager;
import com.is4300.homez.model.Chore;


import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MyChoresFragment extends Fragment {

    String activeUserMock;
    List<Chore> pendingChores;
    List<Chore> completedChores;

    @BindView(R.id.my_pending_chores_list)
    ListView myPendingChoresList;

    @BindView(R.id.my_completed_chores_list)
    ListView myCompletedChoresList;

    ChoreManager choreManager;

    public MyChoresFragment(HomEzApp app) {
        // Required empty public constructor
        this.choreManager = app.choreManager;
        this.activeUserMock = app.activeUserMock;
        this.pendingChores = choreManager.getMyUpcomingChores(activeUserMock);
        this.completedChores = choreManager.getMyCompletedChores(activeUserMock);
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment JoinHouseFragment.
     */
    public static MyChoresFragment newInstance(HomEzApp app) {
        MyChoresFragment fragment = new MyChoresFragment(app);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onResume() {
        super.onResume();
        updateViews();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_chores, container, false);
        ButterKnife.bind(this, view);

        MyChoreAdapter pendingAdapter = new MyChoreAdapter(getActivity().getApplicationContext(), pendingChores, this);
        MyChoreAdapter completedAdapter = new MyChoreAdapter(getActivity().getApplicationContext(), completedChores, this);

        myPendingChoresList.setAdapter(pendingAdapter);
        myCompletedChoresList.setAdapter(completedAdapter);

        return view;
    }

    public void updateViews() {
        this.pendingChores = choreManager.getMyUpcomingChores(activeUserMock);
        this.completedChores = choreManager.getMyCompletedChores(activeUserMock);
        MyChoreAdapter pendingAdapter = new MyChoreAdapter(getActivity().getApplicationContext(), pendingChores, this);
        MyChoreAdapter completedAdapter = new MyChoreAdapter(getActivity().getApplicationContext(), completedChores, this);

        myPendingChoresList.setAdapter(pendingAdapter);
        myCompletedChoresList.setAdapter(completedAdapter);
    }
}
