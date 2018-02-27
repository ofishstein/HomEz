package com.is4300.homez.activity.chore;

/**
 * Created by ianleonard on 2/27/18.
 */

public class ChoreModel {
    String name;
    int value; /* 0 -&gt; checkbox disable, 1 -&gt; checkbox enable */

    ChoreModel(String name, int value){
        this.name = name;
        this.value = value;
    }
    public String getName(){
        return this.name;
    }
    public int getValue(){
        return this.value;
    }


}
