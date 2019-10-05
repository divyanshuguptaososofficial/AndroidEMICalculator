package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate_flat(View v){
        EditText e1= (EditText)findViewById(R.id.editText);
        EditText e2= (EditText)findViewById(R.id.editText2);
        EditText e3= (EditText)findViewById(R.id.editText3);
        EditText e4= (EditText)findViewById(R.id.editText4);

        double loan_amount = Double.parseDouble(e1.getText().toString());
        double tenure = Double.parseDouble(e2.getText().toString());
        double rate = Double.parseDouble(e3.getText().toString());
        double down_payment = Double.parseDouble(e4.getText().toString());


        double principal_amount = (loan_amount)- (down_payment);

        double interest_amount=((principal_amount*rate)/100)*tenure;

        double total_amount_payable=principal_amount+interest_amount;

        double emi=total_amount_payable/tenure;

        Intent intent=new Intent(MainActivity.this,Result.class);
        intent.putExtra("emi",+emi);
        intent.putExtra("principal_amount",+principal_amount);
        intent.putExtra("interest_amount" ,+interest_amount);
        intent.putExtra("total_amount_payavle",+total_amount_payable);

        startActivity(intent);


    }

    public void calculate_reducing(View view){
        EditText e1= (EditText)findViewById(R.id.editText);
        EditText e2= (EditText)findViewById(R.id.editText2);
        EditText e3= (EditText)findViewById(R.id.editText3);
        EditText e4= (EditText)findViewById(R.id.editText4);

        double loan_amount = Double.parseDouble(e1.getText().toString());
        double tenure = Double.parseDouble(e2.getText().toString());
        double rate = Double.parseDouble(e3.getText().toString());
        double down_payment = Double.parseDouble(e4.getText().toString());

        double principal_amount = loan_amount-down_payment;
        double r=rate/100;
        double rate2=1+r;
        double base = rate2, exponent = tenure;
        double result = Math.pow(base, exponent);

        double emi= (principal_amount*(r)*result)/(result-1);
        double amount=principal_amount;
        double total_interest=0;


for(int i=0;i<tenure;i++)
{
    double interest=(principal_amount)*rate/100;

    double paying_amount = (emi)-(interest);
    principal_amount= (principal_amount)-(paying_amount);

    total_interest= (total_interest)+(interest);
}

double total_amount_payable=amount+total_interest;


        Intent intent1=new Intent(MainActivity.this,Reducing.class);
        intent1.putExtra("emi1",+emi);
        intent1.putExtra("amount",+amount);
        intent1.putExtra("total_interest",+total_interest);
        intent1.putExtra("total_amount_payable",+total_amount_payable);


        startActivity(intent1);

    }
}
