package com.is4300.homez.model;

import java.text.SimpleDateFormat;

/**
 * Created by ianleonard on 2/27/18.
 */

public class ChoreModel {
    String name; // name of chore
    int complete; // 0 = incomplete, 1 = complete
    SimpleDateFormat date; // due date of chore, //TODO change format later
    RoommateModel assignee; //person it's assigned to //TODO more than one person?  rotating people?
    Recur recurrence;

    public enum Recur { //TODO is this the right place to define this enum
        DAILY,
        WEEKLY,
        MONTHLY,
        YEARLY;
    }



    public ChoreModel(String name, int complete, SimpleDateFormat date, RoommateModel assignee){ //TODO add recurrence
        this.name = name;
        this.complete = complete;
        this.date = date;
        this.assignee = assignee;
        //this.recurrence = recurrence;
    }
    public String getName(){
        return this.name;
    }
    public int getValue(){
        return this.complete;
    }
    public SimpleDateFormat getDate() { return this.date; }
    public RoommateModel getAssignee() { return this.assignee;}
    public Recur getRecurrence() { return this.recurrence; }


}
