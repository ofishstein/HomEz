package com.is4300.homez.activity.settings;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.is4300.homez.R;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import java.util.ArrayList;

public class HomeSettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_settings);
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
    }
}
