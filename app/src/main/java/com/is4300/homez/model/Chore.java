package com.is4300.homez.model;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ofishstein on 2/28/18.
 */

public class Chore {
    public String name; // name of chore
    public Boolean complete;
    public SimpleDateFormat date; // due date of chore, //TODO change format later
    public String assignee; //person it's assigned to //TODO more than one person?  rotating people?
    public RecurType recurrence;

    public enum RecurType { //TODO is this the right place to define this enum
        DAILY,
        WEEKLY,
        MONTHLY,
        YEARLY;
    }


    Chore(String name, Boolean complete, SimpleDateFormat date, String assignee, RecurType recurrence){ //TODO add recurrence
        this.name = name;
        this.complete = complete;
        this.date = date;
        this.assignee = assignee;
        this.recurrence = recurrence;
    }
    public String getName(){
        return this.name;
    }
    public Boolean isComplete(){
        return this.complete;
    }
    public SimpleDateFormat getDate() { return this.date; }
    public String getAssignee() { return this.assignee;}
    public RecurType getRecurrence() { return this.recurrence; }

    public static List<Chore> generateChoreList() {
        List<Chore> choresList = new ArrayList<>();

        choresList.add(new Chore("Clean Room", false, new SimpleDateFormat("1/1/1"), "Ian Leonard", RecurType.WEEKLY));
        choresList.add(new Chore("Empty Dishwasher", true, new SimpleDateFormat("1/1/1"), "Ian Leonard", RecurType.WEEKLY));
        choresList.add(new Chore("Swab the Poopdeck", true, new SimpleDateFormat("1/1/1"),"Ian Leonard", RecurType.WEEKLY));
        choresList.add(new Chore("Buy Toilet Paper", false, new SimpleDateFormat("1/1/1"), "Ian Leonard", RecurType.WEEKLY));
        choresList.add(new Chore("Take Out Trash", true, new SimpleDateFormat("1/1/1"), "Ian Leonard", RecurType.WEEKLY));

        return choresList;
    }


}