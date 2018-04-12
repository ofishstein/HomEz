package com.is4300.homez.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ofishstein on 2/28/18.
 */

public class EventMock {
    public String weekDay;
    public String startTime;
    public String eventName;

    public EventMock(String day, String time, String eventName) {
        this.weekDay = day;
        this.startTime = time;
        this.eventName = eventName;
    }

    public static List<EventMock> generateMockEventList() {
        List<EventMock> mockEvents = new ArrayList<>();
        mockEvents.add(new EventMock("Wed", "5:30 PM",  "Apartment Showing"));
        mockEvents.add(new EventMock("Thur","10:00 AM",  "Connor Study Group"));
        mockEvents.add(new EventMock("Sat", "8:30 PM", "Event with Beverages"));
        mockEvents.add(new EventMock("Sun", "7:00 AM",  "AndroidCon @ Pru"));

        return mockEvents;
    }
}