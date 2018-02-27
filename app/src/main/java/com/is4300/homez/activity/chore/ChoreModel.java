package com.is4300.homez.activity.chore;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ianleonard on 2/27/18.
 */

public class ChoreModel {
    String name; // name of chore
    int complete; // 0 = incomplete, 1 = complete
    SimpleDateFormat date; // due date of chore, //TODO change format later


    ChoreModel(String name, int complete, SimpleDateFormat date){
        this.name = name;
        this.complete = complete;
        this.date = date;
    }
    public String getName(){
        return this.name;
    }
    public int getValue(){
        return this.complete;
    }
    public SimpleDateFormat getDate() {return this.date; }


}
