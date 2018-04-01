package com.is4300.homez.activity.billsplit;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
    @BindView(R.id.editText0)
    TextView payment0Date;
    @BindView(R.id.editText3)
    TextView payment0Memo;
    @BindView(R.id.editText1)
    TextView payment1Date;
    @BindView(R.id.editText4)
    TextView payment1Memo;
    @BindView(R.id.editText5)
    TextView paymentCancel;


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
                        payment1Date.setVisibility(View.INVISIBLE);
                        payment1Memo.setVisibility(View.INVISIBLE);
                        payButton1.setVisibility(View.GONE);


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
                        payment0Date.setVisibility(View.INVISIBLE);
                        payment0Memo.setVisibility(View.INVISIBLE);
                        payButton2.setVisibility(View.GONE);
                    }
                });
                alertDialog.show();
            }
        });


        this.remindButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "You've sent Ian a reminder!";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

        this.paymentCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(BillSplitActivity.this).create();
                alertDialog.setTitle("CHARGE CANCELLATION");
                alertDialog.setMessage(String.format("Cancel charge to Ian for $175.00?"));

                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();

                    }
                });
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Cancel Payment", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        paymentCancel.setVisibility(View.INVISIBLE);

                    }
                });


            }
        });



    }


}


