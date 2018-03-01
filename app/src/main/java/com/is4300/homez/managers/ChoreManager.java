package com.is4300.homez.managers;

import com.is4300.homez.model.Chore;
import com.is4300.homez.model.RoommateModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ofishstein on 2/25/18.
 */

public class ChoreManager {

    private static ChoreManager choreManagerInstance;
    public List<Chore> mockChoreList;

    private ChoreManager() {

    }

    public static ChoreManager getChoreManagerInstance() {
        if (null == choreManagerInstance) {
            choreManagerInstance = new ChoreManager();
        }
        return choreManagerInstance;
    }

    public void generateMockChoreList() {
        mockChoreList = Chore.generateMockChoreList();
    }

    public List<Chore> getUpcomingChores() {
        List<Chore> upcomingChores = new ArrayList<>();

        for (Chore chore: mockChoreList) {
            if (!chore.complete) {
                upcomingChores.add(chore);
            }
        }

        return upcomingChores;
    }

    public List<Chore> getCompletedChores() {
        List<Chore> completedChores = new ArrayList<>();

        for(Chore chore: mockChoreList) {
            if (chore.complete) {
                completedChores.add(chore);
            }
        }

        return completedChores;
    }

    public List<Chore> getMyUpcomingChores(RoommateModel roommate) {
        List<Chore> upcomingChores = new ArrayList<>();

        for (Chore chore: mockChoreList) {
            if (!chore.complete && chore.assignee.equalsIgnoreCase(roommate.getFull())){
                upcomingChores.add(chore);
            }
        }

        return upcomingChores;
    }
}
