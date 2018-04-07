package com.is4300.homez.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ofishstein on 2/25/18.
 */

public class Status {
    public String userName;
    public StatusType statusType;
    public int timeAway; //minutes


    public Status(String userName, StatusType statusType, int timeAway) {
        this.userName = userName;
        this.statusType = statusType;
        this.timeAway = timeAway;
    }

    public static List<Status> generateMockStatusList() {
        List<Status> statusList = new ArrayList<>();

        statusList.add(new Status("Anna Sciaruto", StatusType.HOME, 0));
        statusList.add(new Status("Ellen Harsha", StatusType.HOME, 0));
        statusList.add(new Status("Lydia Auch", StatusType.AWAY, 10));
        statusList.add(new Status("Tracey Lum", StatusType.DO_NOT_DISTURB, 0));


        return statusList;
    }

    public enum StatusType {
        HOME,
        AWAY,
        DO_NOT_DISTURB;
    }
}
