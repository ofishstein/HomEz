package com.is4300.homez.activity.chore;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.is4300.homez.R;
import com.is4300.homez.activity.adapters.MyChoreAdapter;
import com.is4300.homez.managers.ChoreManager;
import com.is4300.homez.model.Chore;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MyChoresFragment extends Fragment {

    String activeUserMock = new String("Ian Leonard");

    @BindView(R.id.my_pending_chores_list)
    ListView myPendingChoresList;

    @BindView(R.id.my_completed_chores_list)
    ListView myCompletedChoresList;

    ChoreManager choreManager;

    public MyChoresFragment(ChoreManager choreManager) {
        // Required empty public constructor
        this.choreManager = choreManager;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment JoinHouseFragment.
     */
    public static MyChoresFragment newInstance(ChoreManager choreManager) {
        MyChoresFragment fragment = new MyChoresFragment(choreManager);
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
        View view = inflater.inflate(R.layout.fragment_my_chores, container, false);
        ButterKnife.bind(this, view);

        List<Chore> pendingChores = choreManager.getMyUpcomingChores(activeUserMock);
        MyChoreAdapter pendingAdapter = new MyChoreAdapter(getActivity().getApplicationContext(), pendingChores);

        List<Chore> completedChores = choreManager.getMyCompletedChores(activeUserMock);
        MyChoreAdapter completedAdapter = new MyChoreAdapter(getActivity().getApplicationContext(), completedChores);


        myPendingChoresList.setAdapter(pendingAdapter);
        myCompletedChoresList.setAdapter(completedAdapter);

        return view;
    }
}
