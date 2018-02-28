package com.is4300.homez.managers;

import com.is4300.homez.model.EventMock;

import java.util.List;

/**
 * Created by ofishstein on 2/25/18.
 */

public class CalendarManager {

    private static CalendarManager calendarManagerInstance;
    public List<EventMock> mockEventsList;

    private CalendarManager() {

    }

    public static  CalendarManager getCalendarManagerInstance() {
        if (null == calendarManagerInstance) {
            calendarManagerInstance = new CalendarManager();
        }
        return calendarManagerInstance;
    }

    public void generateMockEventsList() {
        mockEventsList = EventMock.generateMockEventList();
    }
}
