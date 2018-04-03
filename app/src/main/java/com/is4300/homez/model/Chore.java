package com.is4300.homez.model;


import android.widget.DatePicker;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ofishstein on 2/28/18.
 */

public class Chore implements Serializable {
    public String name; // name of chore
    public Boolean complete;
    public int dueDay; // due day of chore
    public int dueMo; // due month of chore
    public int dueYear; // due year of chore
    public String assignee; //person it's assigned to //TODO more than one person?  rotating people?
    public RecurType recurrence;

    public enum RecurType { //TODO is this the right place to define this enum
        DAILY,
        WEEKLY,
        MONTHLY,
        YEARLY;
    }


    Chore(String name, Boolean complete, String assignee, RecurType recurrence, int day, int mo, int year){ //TODO add recurrence
        this.name = name;
        this.complete = complete;
        this.assignee = assignee;
        this.recurrence = recurrence;
        this.dueDay = day;
        this.dueMo = mo;
        this.dueYear = year;
    }
    public String getName(){
        return this.name;
    }
    public Boolean isComplete(){
        return this.complete;
    }
    public int getDueDay() { return this.dueDay; }
    public int getDueMo() { return this.dueMo; }
    public int getDueYear() { return this.dueYear; }
    public String getAssignee() { return this.assignee;}
    public RecurType getRecurrence() { return this.recurrence; }

    public void setComplete(Boolean newComplete) { complete = newComplete; }

    public static List<Chore> generateMockChoreList() {
        List<Chore> choresList = new ArrayList<>();

        choresList.add(new Chore("Clean Room", false, "Ian Leonard", RecurType.WEEKLY, 1, 1, 2018));
        choresList.add(new Chore("Empty Dishwasher", true, "Oli Fishstein", RecurType.WEEKLY, 1, 1, 2018));
        choresList.add(new Chore("Swab the Poopdeck", true,"Izzi Tripp", RecurType.WEEKLY, 1, 1, 2018));
        choresList.add(new Chore("Buy Toilet Paper", true, "Connor Rouan", RecurType.WEEKLY, 1, 1, 2018));
        choresList.add(new Chore("Buy Guacamole", false, "Ian Leonard", RecurType.WEEKLY, 1, 1, 2018));
        choresList.add(new Chore("Feed the Fish", false, "Ian Leonard", RecurType.WEEKLY, 1, 1, 2018));
        choresList.add(new Chore("Scrub the Bathtub", true, "Ian Leonard", RecurType.WEEKLY, 1, 1, 2018));


        return choresList;
    }

    //ability to edit a chore that has already been created
    // TODO add assignee into the method once that spinner is working; same w/ recurrance
    public void editChore(String name, int day, int mo, int year){
        this.name = name;
        //this.assignee = assignee;
        //this.recurrence = recurrence;
        this.dueDay = day;
        this.dueMo = mo;
        this.dueYear = year;
    }

    //ability to delete a chore
    public void deleteChore(List<Chore> choreList){
        choreList.remove(this);
    }



}
