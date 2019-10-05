package com.example.emicalculator;



import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Result extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emi_details);
        Intent intent = getIntent();

        double emi = (double) intent.getSerializableExtra("emi");
        double principal_amount = (double) intent.getSerializableExtra("principal_amount");
        double interest_amount = (double) intent.getSerializableExtra("interest_amount");
        double total_amount_payable = (double) intent.getSerializableExtra("total_amount_payavle");

            EditText t1=(EditText)findViewById(R.id.editText9);
        EditText t2=(EditText)findViewById(R.id.editText10);
        EditText t3=(EditText)findViewById(R.id.editText11);
        EditText t4=(EditText)findViewById(R.id.editText12);

      t1.setText(Double.toString(emi));
      t2.setText(Double.toString(principal_amount));
      t3.setText(Double.toString(interest_amount));
      t4.setText(Double.toString(total_amount_payable));




    }

    }
