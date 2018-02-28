package com.is4300.homez.managers;

/**
 * Created by ofishstein on 2/25/18.
 */

public class BillSplitManager {

    private static BillSplitManager billSplitManagerInstance;

    private BillSplitManager() {

    }

    public static  BillSplitManager getBillSplitManagerInstance() {
        if (null == billSplitManagerInstance) {
            billSplitManagerInstance = new BillSplitManager();
        }
        return billSplitManagerInstance;
    }
}
