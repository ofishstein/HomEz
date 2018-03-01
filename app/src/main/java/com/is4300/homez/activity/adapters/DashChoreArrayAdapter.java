package com.is4300.homez.activity.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.is4300.homez.R;
import com.is4300.homez.model.Chore;
import com.is4300.homez.model.Status;

import java.lang.reflect.Array;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ofishstein on 2/28/18.
 */

public class DashChoreArrayAdapter extends ArrayAdapter<Chore> {
    private LayoutInflater inflater;
    private int resource;

    public DashChoreArrayAdapter(@NonNull Context context, int resource, @NonNull List<Chore> objects) {
        super(context, resource, objects);
        this.inflater = LayoutInflater.from(getContext());
        this.resource = resource;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Chore chore = getItem(position);
        ViewHolder holder;

        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(resource, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        if (chore != null) {
            holder.choreName.setText(chore.name);
        }

        return view;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    static class ViewHolder {
        @BindView(R.id.choreName)
        TextView choreName;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
