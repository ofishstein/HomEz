package com.is4300.homez.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tuiolosega.a on 2/28/18.
 */

public class BillSplitModel {

    Roommate assigner;             //the user paying/charging others
    ArrayList<Roommate> assignees; //the recipients of the payment or charge
    double chargeAmount;                //the amount paid/charged
    int splitBetween;                   //the number of recipients to split charge between
    String memo;                        //payment reason
    String date;                        //date
    boolean paymentStatus;              //TRUE if it's been paid, else FALSE
    payOrCharge requestType;            //payment or charge?


    public BillSplitModel(Roommate assigner, ArrayList<Roommate> assignees, double chargeAmount, String memo,
                          String date, boolean paymentStatus, payOrCharge requestType) {
        this.assigner = assigner;
        this.assignees = assignees;
        this.splitBetween = assignees.size();
        this.chargeAmount = chargeAmount;
        this.memo = memo;
        this.date = date;
        this.paymentStatus = paymentStatus;
        this.requestType = requestType;
    }


    public static List<BillSplitModel> generateMockPaymentList() throws IllegalAccessException, InstantiationException {
        // list of dummy payments to use for Bill Split Activity
        List<BillSplitModel> mockPayments = new ArrayList<>();

        // sample assigner for mock purposes
        Roommate connor;
        connor = new Roommate("Connor", "Rouan", "crouan@gmail.com");

        // sample assignees for mock purposes
        Roommate atamai;
        atamai = new Roommate("Atamai", "Tuiolosega", "atuiolosega@gmail.com");

        Roommate ian;
        ian = new Roommate("Ian", "Leonard", "ileonard@gmail.com");

        Roommate izzi;
        izzi = new Roommate("Izzi", "Tripp", "itripp@gmail.com");

        Roommate oli;
        oli = new Roommate("Oli", "Fishstein", "ofish@gmail.com");

        // list of dummy assignees, part 1
        ArrayList<Roommate> sampleAssignees1 = new ArrayList<>();

        sampleAssignees1.add(atamai);
        sampleAssignees1.add(ian);

        // list of dummy assignees, part 2
        ArrayList<Roommate> sampleAssignees2 = new ArrayList<>();

        sampleAssignees1.add(izzi);

        // list of dummy assignees, part 3
        ArrayList<Roommate> sampleAssignees3 = new ArrayList<>();

        sampleAssignees3.add(oli);
        sampleAssignees3.add(atamai);

        BillSplitModel paymentMock1 = new BillSplitModel(connor, sampleAssignees1, 44.00,
                "For Cable", "11/01", false, payOrCharge.CHARGE); //connor charges atamai and ian, REMIND button

        BillSplitModel paymentMock2 = new BillSplitModel(connor, sampleAssignees2,  10.00,
                "Burrito!", "11/05", false, payOrCharge.PAY); //connor pays izzi, PAY button

        BillSplitModel paymentMock3 = new BillSplitModel(connor, sampleAssignees3,  200.00,
                "New TV", "10/15", true, payOrCharge.CHARGE); //connor charges oli and atamai, archived

        mockPayments.add(paymentMock1);
        mockPayments.add(paymentMock2);
        mockPayments.add(paymentMock3);

        return mockPayments;
    }

    public enum payOrCharge {
        PAY,
        CHARGE
    }

}
