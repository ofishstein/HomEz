package com.is4300.homez.activity.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.is4300.homez.R;
import com.is4300.homez.activity.chore.ChoreActivity;
import com.is4300.homez.activity.chore.EditChoreActivity;
import com.is4300.homez.model.Chore;

import java.util.List;

/**
 * Created by ianleonard on 2/27/18.
 */


/*
public class MyChoreAdapter extends ArrayAdapter<Chore> {
    private LayoutInflater inflater;
    private int resource;

    public MyChoreAdapter(@NonNull Context context, int resource, @NonNull List<Chore> objects) {
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

    static class ViewHolder {
        @BindView(R.id.choreName)
        TextView choreName;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
*/



public class AllChoreAdapter extends ArrayAdapter<Chore> {
    List<Chore> modelItems=null;
    Context context;



    public AllChoreAdapter(Context context, List<Chore> resource) {
        super(context, R.layout.all_one_chore, resource);
        this.context = context;
        this.modelItems = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());

        convertView = inflater.inflate(R.layout.all_one_chore, parent, false);

        TextView name = convertView.findViewById(R.id.textView3);
        TextView assignee = convertView.findViewById(R.id.assignee);
        Button choreRemindBtn = convertView.findViewById(R.id.remindButton);

        //CheckBox cb = convertView.findViewById(R.id.checkBox1);

        final Chore item = getItem(position);
        name.setText(item.getName());
        assignee.setText(item.getAssignee());

        if (item.isComplete())
        {
            choreRemindBtn.setVisibility(View.GONE);
            name.setTextColor(Color.rgb(174,174,174));
        }

        choreRemindBtn = (Button) choreRemindBtn.findViewById(R.id.remindButton);
        choreRemindBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Reminder Sent!", Toast.LENGTH_SHORT).show();
            }
        });

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!item.isComplete())
                {
                    Intent intent = new Intent(context, EditChoreActivity.class);
                    intent.putExtra("chore", item);
                    context.startActivity(intent);
                }
            }
        });

        return convertView;
    }
}
