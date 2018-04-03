package com.is4300.homez.activity.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.is4300.homez.R;
import com.is4300.homez.activity.chore.EditChoreActivity;
import com.is4300.homez.activity.chore.MyChoresFragment;
import com.is4300.homez.model.Chore;

import java.util.List;

/**
 * Created by ianleonard on 2/27/18.
 */

public class MyChoreAdapter extends ArrayAdapter<Chore> {
        List<Chore> modelItems=null;
        Context context;
        MyChoresFragment fragment;



    public MyChoreAdapter(Context context, List<Chore> resource, MyChoresFragment fragment) {
        super(context, R.layout.my_one_chore, resource);
        this.context = context;
        this.modelItems = resource;
        this.fragment = fragment;

    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());

        convertView = inflater.inflate(R.layout.my_one_chore, parent, false);

        TextView name = convertView.findViewById(R.id.textView1);

        final CheckBox cb = convertView.findViewById(R.id.checkBox1);


        final Chore item = getItem(position);
        name.setText(item.getName());

        if(item.isComplete())
            cb.setChecked(true);
        else
            cb.setChecked(false);

        cb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                item.setComplete(cb.isChecked());
                v.invalidate();
                fragment.updateViews();

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
