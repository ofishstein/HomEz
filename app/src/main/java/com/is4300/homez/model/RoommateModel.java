package com.is4300.homez.model;

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

    RoommateModel ian = new RoommateModel("Ian", "Leonard", "ian.leonard44@gmail.com");
    RoommateModel connor = new RoommateModel("Connor", "Rouan", "rouan.c@husky.neu.edu");
    RoommateModel oli = new RoommateModel("Oli", "Fishstein", "ian.leonard44@gmail.com");
    RoommateModel izzi = new RoommateModel("Izzi", "Tripp", "ian.leonard44@gmail.com");
    RoommateModel atamai = new RoommateModel("Atamai", "Tuiolosega", "ian.leonard44@gmail.com");






}
