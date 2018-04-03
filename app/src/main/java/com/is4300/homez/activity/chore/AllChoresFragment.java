package com.is4300.homez.activity.chore;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.is4300.homez.HomEzApp;
import com.is4300.homez.R;
import com.is4300.homez.activity.adapters.AllChoreAdapter;
import com.is4300.homez.activity.adapters.MyChoreAdapter;
import com.is4300.homez.managers.ChoreManager;
import com.is4300.homez.model.Chore;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AllChoresFragment extends Fragment {

    @BindView(R.id.all_pending_chores_list)
    ListView allPendingChoresList;

    @BindView(R.id.all_completed_chores_list)
    ListView allCompletedChoresList;

    ChoreManager choreManager;
    List<Chore> pendingChores;
    List<Chore> completedChores;

    public AllChoresFragment(HomEzApp app) {
        // Required empty public constructor
        this.choreManager = app.choreManager;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment JoinHouseFragment.
     */
    public static AllChoresFragment newInstance(HomEzApp app) {
        AllChoresFragment fragment = new AllChoresFragment(app);
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
        View view = inflater.inflate(R.layout.fragment_all_chores, container, false);
        ButterKnife.bind(this, view);

        List<Chore> pendingChores = choreManager.getUpcomingChores();
        AllChoreAdapter pendingAdapter = new AllChoreAdapter(getActivity().getApplicationContext(), pendingChores);

        List<Chore> completedChores = choreManager.getCompletedChores();
        AllChoreAdapter completedAdapter = new AllChoreAdapter(getActivity().getApplicationContext(), completedChores);


        allPendingChoresList.setAdapter(pendingAdapter);
        allCompletedChoresList.setAdapter(completedAdapter);

        return view;
    }

    public void updateViews() {
        this.pendingChores = choreManager.getUpcomingChores();
        this.completedChores = choreManager.getCompletedChores();
        AllChoreAdapter pendingAdapter = new AllChoreAdapter(getActivity().getApplicationContext(), pendingChores);
        AllChoreAdapter completedAdapter = new AllChoreAdapter(getActivity().getApplicationContext(), completedChores);

        allPendingChoresList.setAdapter(pendingAdapter);
        allCompletedChoresList.setAdapter(completedAdapter);
    }
}
