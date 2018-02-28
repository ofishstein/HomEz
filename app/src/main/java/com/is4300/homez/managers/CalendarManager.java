package com.is4300.homez.managers;

/**
 * Created by ofishstein on 2/25/18.
 */

public class CalendarManager {

    private static CalendarManager calendarManagerInstance;

    private CalendarManager() {

    }

    public static  CalendarManager getCalendarManagerInstance() {
        if (null == calendarManagerInstance) {
            calendarManagerInstance = new CalendarManager();
        }
        return calendarManagerInstance;
    }
}
