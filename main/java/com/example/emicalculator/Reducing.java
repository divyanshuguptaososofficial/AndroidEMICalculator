package com.example.emicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Reducing extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reducing);
        Intent intent1 = getIntent();

        double emi1 = (double) intent1.getSerializableExtra("emi1");
        double principal_amount = (double) intent1.getSerializableExtra("amount");
        double interest_amount = (double) intent1.getSerializableExtra("total_interest");
        double total_amount_payable = (double) intent1.getSerializableExtra("total_amount_payable");
        EditText t1=(EditText)findViewById(R.id.editText9);

        EditText t2=(EditText)findViewById(R.id.editText10);
        EditText t3=(EditText)findViewById(R.id.editText11);
        EditText t4=(EditText)findViewById(R.id.editText12);

        t1.setText(Double.toString(+emi1));
        t2.setText(Double.toString(principal_amount));
        t3.setText(Double.toString(interest_amount));
        t4.setText(Double.toString(total_amount_payable));


    }
}