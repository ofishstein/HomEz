package com.is4300.homez.activity.settings;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.is4300.homez.R;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.is4300.homez.activity.DashboardActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeSettingsActivity extends AppCompatActivity {

    @BindView(R.id.HomeName)
    EditText HomeName;
    @BindView(R.id.hSettings_saveButton)
    Button hSettings_saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_settings);
        ButterKnife.bind(this);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        SwipeMenuListView listView = (SwipeMenuListView) findViewById(R.id.roommateListView);

        ArrayList<String> roommates = new ArrayList<>();
        roommates.add("Ian Leonad");
        roommates.add("Atamai Tuiolosega");
        roommates.add("Oli Fishstein");
        roommates.add("Izzi Tripp");

        ArrayAdapter roommateAdapter = new ArrayAdapter(HomeSettingsActivity.this, android.R.layout.simple_list_item_1, roommates);
        listView.setAdapter(roommateAdapter);

        SwipeMenuCreator creator = new SwipeMenuCreator() {

            @Override
            public void create(SwipeMenu menu) {
                SwipeMenuItem deleteItem = new SwipeMenuItem(
                        getApplicationContext());
                deleteItem.setBackground(new ColorDrawable(Color.rgb(0xF9,
                        0x3F, 0x25)));
                deleteItem.setWidth(170);
                deleteItem.setIcon(R.drawable.ic_remove);
                menu.addMenuItem(deleteItem);
            }
        };

        // set creator
        listView.setMenuCreator(creator);

        listView.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {

                return false;
            }
        });
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        hSettings_saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}
