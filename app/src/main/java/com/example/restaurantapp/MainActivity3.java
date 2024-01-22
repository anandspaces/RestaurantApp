package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button submit = findViewById(R.id.button5);
        Button edit = findViewById(R.id.button6);
        TextView Name = findViewById(R.id.textView18);
        TextView Email = findViewById(R.id.textView19);
        TextView PhoneNo = findViewById(R.id.textView20);
        TextView Date_Time = findViewById(R.id.textView21);
        TextView TableNo = findViewById(R.id.textView22);
        TextView NoOfDiners = findViewById(R.id.textView23);
        Intent intent = getIntent();
        String firstNameS = intent.getStringExtra("firstName_data");
        String lastNameS = intent.getStringExtra("lastName_data");
        String emailS = intent.getStringExtra("email_data");
        String phoneNoS = intent.getStringExtra("phoneNo_data");
        String dateS = intent.getStringExtra("date_data");
        String timeS = intent.getStringExtra("time_data");
        String noOfDinersS = intent.getStringExtra("noOfDiners_data");
        int intValue = generateRandom();
        String stringValue = Integer.toString(intValue);
        String NS = "Name: "+firstNameS+" "+lastNameS;
        String ES = "Email: "+emailS;
        String PS = "Phone No.: "+phoneNoS;
        String DTS = "Date/Time: "+dateS+" "+timeS;
        String TS = "Table No. "+stringValue;
        String DS = "No. of Diners: "+noOfDinersS;
        Name.setText(NS);
        Email.setText(ES);
        PhoneNo.setText(PS);
        Date_Time.setText(DTS);
        TableNo.setText(TS);
        NoOfDiners.setText(DS);
        submit.setOnClickListener(view -> submitF());
        edit.setOnClickListener(view -> editF());
    }
    private void submitF(){
        Intent i = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(i);
    }
    private void editF(){
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(i);
    }
    private int generateRandom(){
        Random random = new Random();
        return random.nextInt((999-100)+1)+100;
    }
}