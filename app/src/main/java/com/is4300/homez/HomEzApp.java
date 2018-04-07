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

    public String[] spinnerNames = {"Anna Sciaruto", "Ellen Harsha", "Lydia Auch", "Tracey Lum"};
    public String activeUserMock = "Anna Sciaruto";

    Roommate ian = new Roommate("Ian", "Leonard", "ian.leonard44@gmail.com");
    Roommate connor = new Roommate("Connor", "Rouan", "rouan.c@husky.neu.edu");
    Roommate oli = new Roommate("Oli", "Fishstein", "ian.leonard44@gmail.com");
    Roommate izzi = new Roommate("Izzi", "Tripp", "ian.leonard44@gmail.com");
    Roommate atamai = new Roommate("Atamai", "Tuiolosega", "ian.leonard44@gmail.com");

    //Roommates for Anna Cullen Test
    Roommate anna = new Roommate("Anna", "Cullen", "ian.leonard44@gmail.com");
    Roommate raj = new Roommate("Danielle", "Diraddo", "ian.leonard44@gmail.com");
    Roommate zach = new Roommate("Sophia", "Keins", "ian.leonard44@gmail.com");
    Roommate jon = new Roommate("Emma", "Katz", "ian.leonard44@gmail.com");

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
