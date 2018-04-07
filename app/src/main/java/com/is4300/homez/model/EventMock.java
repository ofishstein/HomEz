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
        mockEvents.add(new EventMock("Sat", "3:30 PM",  "apartment showing"));
        mockEvents.add(new EventMock("Sun","10:00 AM",  "Ellen study group (living room"));
        mockEvents.add(new EventMock("Sun", "8:30 PM", "Lydia hosting dinner (7+ people)"));
        mockEvents.add(new EventMock("Mon", "7:00 AM",  "Ellen making pancakes"));

        return mockEvents;
    }
}