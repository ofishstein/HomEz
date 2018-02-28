package com.is4300.homez.activity.onboarding;

/**
 * Created by ianleonard on 2/27/18.
 */

public class RoommateModel {
    String first; // first
    String last; // last name
    String email; //email


    public RoommateModel(String first, String last, String email){
        this.first = first;
        this.last = last;
        this.email = email;
    }
    public String getFirst(){
        return this.first;
    }
    public String getLast() { return this.last; }
    public String getFull() { return this.first + this.last; }
    public String getPossessive() { return this.first + "'s"; }
    public String getFullPossessive() { return this.first + this.last + "'s"; }
    public String getEmail() { return this.email; }


}
