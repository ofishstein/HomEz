package com.is4300.homez.activity.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.is4300.homez.R;
import com.is4300.homez.model.Chore;

import java.util.List;

/**
 * Created by ianleonard on 2/27/18.
 */

public class MyChoreAdapter extends ArrayAdapter<Chore> {
        List<Chore> modelItems=null;
        Context context;



    public MyChoreAdapter(Context context, List<Chore> resource) {
        super(context, R.layout.my_one_chore, resource);
        this.context = context;
        this.modelItems = resource;
        }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());

        convertView = inflater.inflate(R.layout.my_one_chore, parent, false);

        TextView name = convertView.findViewById(R.id.textView1);

        CheckBox cb = convertView.findViewById(R.id.checkBox1);


        Chore item = getItem(position);
        name.setText(item.getName());

        if(item.isComplete())
            cb.setChecked(true);
        else
            cb.setChecked(false);
        return convertView;
        }
}
