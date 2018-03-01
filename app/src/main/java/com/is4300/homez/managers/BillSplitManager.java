package com.is4300.homez.managers;

import com.is4300.homez.model.BillSplitModel;

import java.util.List;

/**
 * Created by ofishstein on 2/25/18.
 */

public class BillSplitManager {

    private static BillSplitManager billSplitManagerInstance;
    public List<BillSplitModel> mockPaymentList;

    private BillSplitManager() {

    }

    public static  BillSplitManager getBillSplitManagerInstance() {
        if (null == billSplitManagerInstance) {
            billSplitManagerInstance = new BillSplitManager();
        }
        return billSplitManagerInstance;
    }

    public void generateMockPaymentsList() throws InstantiationException, IllegalAccessException {
        mockPaymentList = BillSplitModel.generateMockPaymentList();
    }
}
