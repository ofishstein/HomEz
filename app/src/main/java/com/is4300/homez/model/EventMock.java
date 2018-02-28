package com.is4300.homez.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ofishstein on 2/28/18.
 */

public class EventMock {
    public String time;
    public String eventName;

    public EventMock(String time, String eventName) {
        this.time = time;
        this.eventName = eventName;
    }

    public static List<EventMock> generateMockEventList() {
        List<EventMock> mockEvents = new ArrayList<>();
        mockEvents.add(new EventMock("10:00 AM", "Apartment Brunch"));
        mockEvents.add(new EventMock("2:00 PM", "Dog Walking"));
        mockEvents.add(new EventMock("10:00 PM", "Costume Party"));

        return mockEvents;
    }
}
