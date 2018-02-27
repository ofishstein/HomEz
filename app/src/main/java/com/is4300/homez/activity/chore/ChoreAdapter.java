package com.is4300.homez.activity.chore;

/**
 * Created by ianleonard on 2/27/18.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.is4300.homez.R;

public class ChoreAdapter extends ArrayAdapter<ChoreModel>{
        ChoreModel[]modelItems=null;
        Context context;



    public ChoreAdapter(Context context, ChoreModel[] resource) {
        super(context, R.layout.one_chore,resource);
        // TODO Auto-generated constructor stub
        this.context = context;
        this.modelItems = resource;
        }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.one_chore, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.textView1);
        CheckBox cb = (CheckBox) convertView.findViewById(R.id.checkBox1);
        name.setText(modelItems[position].getName());
        if(modelItems[position].getValue() == 1)
        cb.setChecked(true);
        else
        cb.setChecked(false);
        return convertView;
        }
}
