package com.is4300.homez.activity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.is4300.homez.model.Status;
import com.is4300.homez.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ofishstein on 2/28/18.
 */

public class StatusArrayAdapter extends ArrayAdapter<Status> {

    private LayoutInflater inflater;
    private int resource;


    public StatusArrayAdapter(@NonNull Context context, int resource, @NonNull List<Status> objects) {
        super(context, resource, objects);
        this.inflater = LayoutInflater.from(getContext());
        this.resource = resource;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Status status = getItem(position);
        ViewHolder holder;

        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(resource, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        if (status != null) {

            holder.userName.setText(status.userName);

            switch (status.statusType) {
                case HOME:
                    holder.statusCircle.setColorFilter(getContext().getColor(R.color.green));
                    holder.homeStatus.setText(R.string.home);
                    break;
                case AWAY:
                    holder.statusCircle.setColorFilter(getContext().getColor(R.color.colorPrimaryLight));
                    holder.homeStatus.setText(R.string.away);
                    holder.awayTime.setText(formatAwayTime(status.timeAway));
                    break;
                case DO_NOT_DISTURB:
                    holder.statusCircle.setColorFilter(getContext().getColor(R.color.red));
                    holder.homeStatus.setText(R.string.do_not_disturb);
                    break;
            }
        }

        return view;
    }

    private String formatAwayTime(int minutes) {
        int hrs = minutes / 60;
        int min = minutes % 60;

        if (hrs < 1) {
            return String.format("%d mins", min);
        } else if (min == 0) {
            return String.format("%d hours", hrs);
        }

        return String.format("%d hours %d mins", hrs, min);
    }

    static class ViewHolder {
        @BindView(R.id.statusCircle)
        ImageView statusCircle;
        @BindView(R.id.userName)
        TextView userName;
        @BindView(R.id.homeStatus)
        TextView homeStatus;
        @BindView(R.id.awayTime)
        TextView awayTime;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
