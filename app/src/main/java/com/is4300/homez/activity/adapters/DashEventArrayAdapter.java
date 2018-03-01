package com.is4300.homez.activity.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.is4300.homez.R;
import com.is4300.homez.model.Chore;
import com.is4300.homez.model.EventMock;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ofishstein on 2/28/18.
 */

public class DashEventArrayAdapter extends ArrayAdapter<EventMock> {

    private LayoutInflater inflater;
    private int resource;

    public DashEventArrayAdapter(@NonNull Context context, int resource, @NonNull List<EventMock> objects) {
        super(context, resource, objects);
        this.inflater = LayoutInflater.from(getContext());
        this.resource = resource;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        EventMock event = getItem(position);
        ViewHolder holder;

        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(resource, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        if (event != null) {
            holder.eventName.setText(event.eventName);
            holder.eventTime.setText(event.time);
        }

        return view;
    }

    static class ViewHolder {
        @BindView(R.id.eventName)
        TextView eventName;
        @BindView(R.id.eventTime)
        TextView eventTime;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}