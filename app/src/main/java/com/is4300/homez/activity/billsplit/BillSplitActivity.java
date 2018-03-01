package com.is4300.homez.activity.billsplit;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.is4300.homez.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BillSplitActivity extends AppCompatActivity {

   // @BindView(R.id.billSplitModule)
    //ViewPager billSplitView;
    @BindView(R.id.billSplitModule)
    TabLayout choreTabLayout;


    private BillSplitAdapter BillSplitAdapter;

    String tabMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_split);
        ButterKnife.bind(this);

        choreTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // this should be a class variable
                tabMode = (String) tab.getText();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //LEAVE BLANK
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                //LEAVE BLANK
            }
        });
    }
}
