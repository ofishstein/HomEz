package com.is4300.homez.activity.calendar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.is4300.homez.R;
import com.is4300.homez.activity.adapters.CalendarAdapter;
import com.is4300.homez.managers.CalendarManager;
import com.is4300.homez.model.EventMock;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by izzitripp on 2/28/18.
 */

public class DayFragment extends Fragment {

    @BindView(R.id.event_list)
    ListView event_list;

    private CalendarManager calManager;

    public DayFragment() {
        // Required public empty constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment DayFragment.
     */
    public static DayFragment newInstance(CalendarManager calM) {
        DayFragment fragment = new DayFragment();
        fragment.setManager(calM);
        return fragment;
    }

    /**
     * Set the calendar manager for this fragment.
     * @param calM the new manager
     */
    public void setManager(CalendarManager  calM) {
        this.calManager = calM;
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

       List<EventMock> tasks = calManager.mockEventsList;
       CalendarAdapter calAdapter = new CalendarAdapter(getActivity().getApplicationContext(), tasks);

       event_list.setAdapter(calAdapter);

       return view;
    }

}
