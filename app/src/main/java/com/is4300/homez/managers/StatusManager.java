package com.is4300.homez.managers;

import com.is4300.homez.model.Status;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ofishstein on 2/25/18.
 */

public class StatusManager {

    private static StatusManager statusManagerInstance;
    public List<Status> mockStatusList;

    private StatusManager() {

    }

    public static StatusManager getStatusManagerInstance() {
        if (null == statusManagerInstance) {
            statusManagerInstance = new StatusManager();
        }
        return statusManagerInstance;
    }

    public void generateMockStatusList() {
        mockStatusList = Status.generateMockStatusList();
    }

    public List<Status> getHomeUsers() {
        List<Status> homeStatuses = new ArrayList<>();
        for (Status status : mockStatusList) {
            if (status.statusType == Status.StatusType.HOME) {
                homeStatuses.add(status);
            }
        }

        return homeStatuses;
    }


}
