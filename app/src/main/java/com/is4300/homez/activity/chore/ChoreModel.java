package com.is4300.homez.activity.chore;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ianleonard on 2/27/18.
 */

public class ChoreModel {
    String name;
    int value; /* 0 -&gt; checkbox disable, 1 -&gt; checkbox enable */
    SimpleDateFormat date;

    ChoreModel(String name, int value, SimpleDateFormat date){
        this.name = name;
        this.value = value;
        this.date = date;
    }
    public String getName(){
        return this.name;
    }
    public int getValue(){
        return this.value;
    }
    public SimpleDateFormat getDate() {return this.date; }


}
