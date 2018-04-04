package com.is4300.homez;

import android.app.Application;

import com.is4300.homez.managers.BillSplitManager;
import com.is4300.homez.managers.CalendarManager;
import com.is4300.homez.managers.ChoreManager;
import com.is4300.homez.managers.StatusManager;
import com.is4300.homez.model.Roommate;

/**
 * Created by ofishstein on 2/25/18.
 */

public class HomEzApp extends Application {

    public BillSplitManager billSplitManager;
    public CalendarManager calendarManager;
    public ChoreManager choreManager;
    public StatusManager statusManager;

    public String[] spinnerNames = {"Alex Melagrano", "Raj Narayan", "Zach Lowen", "Jonathan Northcott", "Eli Foreman", "Eliza Pedersen"};
    public String activeUserMock = "Alex Melagrano";

    Roommate ian = new Roommate("Ian", "Leonard", "ian.leonard44@gmail.com");
    Roommate connor = new Roommate("Connor", "Rouan", "rouan.c@husky.neu.edu");
    Roommate oli = new Roommate("Oli", "Fishstein", "ian.leonard44@gmail.com");
    Roommate izzi = new Roommate("Izzi", "Tripp", "ian.leonard44@gmail.com");
    Roommate atamai = new Roommate("Atamai", "Tuiolosega", "ian.leonard44@gmail.com");

    //Roommates for Alex Melagrano Test
    Roommate alex = new Roommate("Alex", "Melagrano", "ian.leonard44@gmail.com");
    Roommate raj = new Roommate("Raj", "Narayan", "ian.leonard44@gmail.com");
    Roommate zach = new Roommate("Zach", "Lowen", "ian.leonard44@gmail.com");
    Roommate jon = new Roommate("Jonathan", "Northcott", "ian.leonard44@gmail.com");
    Roommate eli = new Roommate("Eli", "Foreman", "ian.leonard44@gmail.com");
    Roommate eliza = new Roommate("Eliza", "Pedersen", "ian.leonard44@gmail.com");

    @Override
    public void onCreate() {
        super.onCreate();

        statusManager = StatusManager.getStatusManagerInstance();
        choreManager = ChoreManager.getChoreManagerInstance();
        calendarManager = CalendarManager.getCalendarManagerInstance();
        billSplitManager = BillSplitManager.getBillSplitManagerInstance();

        statusManager.generateMockStatusList();
        choreManager.generateMockChoreList();
        calendarManager.generateMockEventsList();
    }
}
