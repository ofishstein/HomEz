package com.is4300.homez.activity.calendar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.is4300.homez.R;
import com.is4300.homez.model.EventMock;

import java.util.List;

/**
 * Created by izzitripp on 2/28/18.
 */

public class CalendarAdapter extends ArrayAdapter<EventMock> {

    List<EventMock> events = null;
    Context context;

    public CalendarAdapter(@NonNull Context context, List<EventMock> resource) {
        super(context, R.layout.item_dash_calendar_event, resource);
        this.context = context;
        this.events = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        convertView = inflater.inflate(R.layout.item_dash_calendar_event, parent, false);

        TextView time = convertView.findViewById(R.id.eventTime);
        TextView name = convertView.findViewById(R.id.eventName);

        EventMock item = getItem(position);
        time.setText(item.time);
        name.setText(item.eventName);

        return convertView;
    }
}
