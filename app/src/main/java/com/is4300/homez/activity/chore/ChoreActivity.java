package com.is4300.homez.activity.chore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.is4300.homez.R;
import com.is4300.homez.activity.onboarding.RoommateModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

import static com.is4300.homez.activity.chore.ChoreModel.Recur.WEEKLY;

public class ChoreActivity extends Activity {
    ListView lv;
    ChoreModel[] modelItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_chore);
        lv = findViewById(R.id.all_list);

        modelItems = new ChoreModel[5];
        modelItems[0] = new ChoreModel("Clean Room", 0, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));
        modelItems[1] = new ChoreModel("Empty Dishwasher", 1, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));
        modelItems[2] = new ChoreModel("Swab the Poopdeck", 1, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));
        modelItems[3] = new ChoreModel("Buy Toilet Paper", 0, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));
        modelItems[4] = new ChoreModel("Take Out Trash", 1, new SimpleDateFormat("1/1/1"), new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com"));

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