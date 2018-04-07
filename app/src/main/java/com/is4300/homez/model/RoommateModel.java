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

    //  TEST 1 SUBJECTS

    RoommateModel alex = new RoommateModel("Anna", "Sciaruto", "annasc@gmail.com");
    RoommateModel raj = new RoommateModel("Ellen", "Harsha", "harsha.e@gmail.com");
    RoommateModel zach = new RoommateModel("Lydia", "Auch", "auch.lyd@gmail.com");
    RoommateModel jonathan = new RoommateModel("Tracey", "Lun", "tlum@gmail.com");

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

}
