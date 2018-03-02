package com.is4300.homez.activity.billsplit;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.is4300.homez.R;
import com.is4300.homez.activity.DashboardActivity;
import com.is4300.homez.activity.calendar.AddEventActivity;
import com.is4300.homez.activity.onboarding.RegisterActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.support.v4.os.LocaleListCompat.create;

public class BillSplitActivity extends AppCompatActivity {

    @BindView(R.id.billSplitPayButton1)
    Button payButton1;
    @BindView(R.id.billSplitPayButton2)
    Button payButton2;
    @BindView(R.id.billSplitRemindButton1)
    Button remindButton;


    private com.is4300.homez.activity.adapters.BillSplitAdapter BillSplitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_split);
        ButterKnife.bind(this);
        setOnClickListeners();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_add, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.addMenu) {
            Intent intent = new Intent(this, BillSplitCreateActivity.class);
            startActivity(intent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }


    private void setOnClickListeners() {


        this.payButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(BillSplitActivity.this).create();
                alertDialog.setTitle("PAYMENT CONFIRMATION");
                alertDialog.setMessage(String.format("Pay Izzi $75.00?"));
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

        this.payButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(BillSplitActivity.this).create();
                alertDialog.setTitle("PAYMENT CONFIRMATION");
                alertDialog.setMessage(String.format("Pay Connor $12.00?"));
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                alertDialog.show();
            }
        });


        this.remindButton.setOnClickListener(null);



    }


}


