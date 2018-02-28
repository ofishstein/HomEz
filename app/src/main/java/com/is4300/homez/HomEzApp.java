package com.is4300.homez;

import android.app.Application;

import com.is4300.homez.managers.BillSplitManager;
import com.is4300.homez.managers.CalendarManager;
import com.is4300.homez.managers.ChoreManager;
import com.is4300.homez.managers.StatusManager;

/**
 * Created by ofishstein on 2/25/18.
 */

public class HomEzApp extends Application {

    public BillSplitManager billSplitManager;
    public CalendarManager calendarManager;
    public ChoreManager choreManager;
    public StatusManager statusManager;

    @Override
    public void onCreate() {
        super.onCreate();

        statusManager = StatusManager.getStatusManagerInstance();
        choreManager = ChoreManager.getChoreManagerInstance();
        calendarManager = CalendarManager.getCalendarManagerInstance();
        billSplitManager = BillSplitManager.getBillSplitManagerInstance();

        statusManager.generateMockStatusList();
        choreManager.generateMockChoreList();
    }
}
