package com.is4300.homez.managers;

/**
 * Created by ofishstein on 2/25/18.
 */

public class ChoreManager {

    private static ChoreManager choreManagerInstance;

    private ChoreManager() {

    }

    public static ChoreManager getChoreManagerInstance() {
        if (null == choreManagerInstance) {
            choreManagerInstance = new ChoreManager();
        }
        return choreManagerInstance;
    }
}
