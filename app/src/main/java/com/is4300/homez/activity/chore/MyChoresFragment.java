package com.is4300.homez.activity.chore;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.is4300.homez.HomEzApp;
import com.is4300.homez.R;
import com.is4300.homez.model.ChoreModel;
import com.is4300.homez.model.RoommateModel;

import java.text.SimpleDateFormat;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MyChoresFragment extends Fragment {

    @BindView(R.id.my_chores_list)
    ListView my_chores_list;

    ChoreModel[] modelItems;

    public MyChoresFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment JoinHouseFragment.
     */
    public static MyChoresFragment newInstance() {
        MyChoresFragment fragment = new MyChoresFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_chore);
        //lv = findViewById(R.id.all_list);

        modelItems = new ChoreModel[5];
        modelItems[0] = new ChoreModel("Clean Room", 0, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));
        modelItems[1] = new ChoreModel("Empty Dishwasher", 1, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));
        modelItems[2] = new ChoreModel("Swab the Poopdeck", 1, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));
        modelItems[3] = new ChoreModel("Buy Toilet Paper", 0, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));
        modelItems[4] = new ChoreModel("Take Out Trash", 1, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));

        //ChoreAdapter adapter = new ChoreAdapter(this, modelItems);
        //lv.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_chores, container, false);
        ButterKnife.bind(this, view);

        ((HomEzApp) getActivity().getApplicationContext()).



        return view;
    }
}
