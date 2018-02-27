package com.is4300.homez.activity.chore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.is4300.homez.R;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class ChoreActivity extends Activity {
    ListView lv;
    ChoreModel[] modelItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chore);
        lv = (ListView) findViewById(R.id.all_list);
        modelItems = new ChoreModel[5];
        modelItems[0] = new ChoreModel("pizza", 0);
        modelItems[1] = new ChoreModel("burger", 1);
        modelItems[2] = new ChoreModel("olives", 1);
        modelItems[3] = new ChoreModel("orange", 0);
        modelItems[4] = new ChoreModel("tomato", 1);
        ChoreAdapter adapter = new ChoreAdapter(this, modelItems);
        lv.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
        return true;
    }
}