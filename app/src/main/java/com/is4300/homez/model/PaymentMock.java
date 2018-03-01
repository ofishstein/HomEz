package com.is4300.homez.model;

import java.sql.Array;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tuiolosega.a on 2/28/18.
 */

public class PaymentMock {

        RoommateModel assigner;             //the user paying/charging others
        ArrayList<RoommateModel> assignees; //the recipients of the payment or charge
        double chargeAmount;                //the amount paid/charged
        int splitBetween;                   //the number of recipients to split charge between
        String memo;                        //payment reason
        String date;                        //date
        boolean paymentStatus;              //TRUE if it's been paid, else FALSE
        payOrCharge requestType;            //payment or charge?


        public PaymentMock(RoommateModel assigner, ArrayList<RoommateModel> assignees, double chargeAmount, String memo, String date, boolean paymentStatus, payOrCharge requestType) {
            this.assigner = assigner;
            this.assignees = assignees;
            this.splitBetween = assignees.size();
            this.chargeAmount = chargeAmount;
            this.memo = memo;
            this.date = date;
            this.paymentStatus = paymentStatus;
            this.requestType = requestType;
        }


        public static List<PaymentMock> generateMockPaymentList() throws IllegalAccessException, InstantiationException {
            // list of dummy payments to use for Bill Split Activity
            List<PaymentMock> mockPayments = new ArrayList<>();

            // sample assigner for mock purposes
            RoommateModel connor;
            connor = RoommateModel.class.newInstance().connor;

            // list of dummy assignees, part 1
            ArrayList<RoommateModel> sampleAssignees1 = new ArrayList<>();

            sampleAssignees1.add(RoommateModel.class.newInstance().atamai);
            sampleAssignees1.add(RoommateModel.class.newInstance().ian);

            // list of dummy assignees, part 2
            ArrayList<RoommateModel> sampleAssignees2 = new ArrayList<>();

            sampleAssignees1.add(RoommateModel.class.newInstance().izzi);

            // list of dummy assignees, part 3
            ArrayList<RoommateModel> sampleAssignees3 = new ArrayList<>();
            sampleAssignees3.add(RoommateModel.class.newInstance().oli);
            sampleAssignees3.add(RoommateModel.class.newInstance().atamai);

            PaymentMock paymentMock1 = new PaymentMock(connor, sampleAssignees1, 44.00,
                    "For Cable", "11/01", false, payOrCharge.CHARGE); //connor charges atamai and ian, REMIND button

            PaymentMock paymentMock2 = new PaymentMock(connor, sampleAssignees2,  10.00,
                    "Burrito!", "11/05", false, payOrCharge.PAY); //connor pays izzi, PAY button

            PaymentMock paymentMock3 = new PaymentMock(connor, sampleAssignees3,  200.00,
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


