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

    public RoommateModel() {
        //Empty constructor
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

    // PILOT TEST SUBJECTS

    RoommateModel alex = new RoommateModel("Connor", "Rouan", "melagrano.a@gmail.com");
    RoommateModel raj = new RoommateModel("Will", "Tien-Street", "narayan.r@gmail.com");
    RoommateModel zach = new RoommateModel("Mike", "Scott", "lowen.z@gmail.com");
    RoommateModel jonathan = new RoommateModel("Alex", "Hughes", "northcott.j@gmail.com");
    RoommateModel eli = new RoommateModel("Brian", "Joseph", "foreman.e@gmail.com");

    public RoommateModel getAlex() {
        return alex;
    }

    public RoommateModel getRaj() {
        return raj;
    }

    public RoommateModel getZach() {
        return zach;
    }

    public RoommateModel getJonathan() {
        return jonathan;
    }

    public RoommateModel getEli() {
        return eli;
    }
}
