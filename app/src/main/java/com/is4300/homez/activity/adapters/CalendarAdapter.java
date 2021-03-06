package com.is4300.homez.activity.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.is4300.homez.R;
import com.is4300.homez.activity.calendar.CalViewType;
import com.is4300.homez.model.EventMock;

import java.util.List;

/**
 * Created by izzitripp on 2/28/18.
 */

public class CalendarAdapter extends ArrayAdapter<EventMock> {

    private List<EventMock> events = null;
    private Context context;
    private CalViewType viewType;

    public CalendarAdapter(@NonNull Context context, List<EventMock> resource, CalViewType v) {
        super(context, R.layout.item_calendar_event_stacked, resource);
        this.context = context;
        this.events = resource;
        this.viewType = v;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        TextView day;
        TextView time;
        TextView name;

        convertView = inflater.inflate(R.layout.item_calendar_event_stacked, parent, false);
        day = convertView.findViewById(R.id.weekDay);
        time = convertView.findViewById(R.id.eventTime);
        name = convertView.findViewById(R.id.eventName);

        EventMock item = getItem(position);
        day.setText(item.weekDay);
        time.setText(item.startTime);
        name.setText(item.eventName);

        return convertView;
    }
}
