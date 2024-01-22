package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button submit = findViewById(R.id.button);
        Button back = findViewById(R.id.button2);

        submit.setOnClickListener(view -> submitF());
        back.setOnClickListener(view -> backF());
    }
    private void submitF(){
        EditText date = findViewById(R.id.editTextDate);
        EditText time = findViewById(R.id.editTextTime);
        EditText noOfDiners = findViewById(R.id.editTextNumber);
        EditText firstName = findViewById(R.id.editTextText2);
        EditText lastName = findViewById(R.id.editTextText3);
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText phoneNo = findViewById(R.id.editTextPhone);
        String dateS = date.getText().toString();
        String timeS = time.getText().toString();
        String noOfDinersS = noOfDiners.getText().toString();
        String firstNameS = firstName.getText().toString();
        String lastNameS = lastName.getText().toString();
        String emailS = email.getText().toString();
        String phoneNoS = phoneNo.getText().toString();
        if(dateS!=null && timeS!=null && noOfDinersS!=null && firstNameS!=null && lastNameS!=null && emailS!=null && phoneNoS!=null) {
            Intent i = new Intent(getApplicationContext(), MainActivity3.class);
            i.putExtra("date_data",dateS);
            i.putExtra("time_data",timeS);
            i.putExtra("noOfDiners_data",noOfDinersS);
            i.putExtra("firstName_data",firstNameS);
            i.putExtra("lastName_data",lastNameS);
            i.putExtra("email_data",emailS);
            i.putExtra("phoneNo_data",phoneNoS);
            startActivity(i);
        } else {
            Toast.makeText(this, "(*) Marked fields can't be empty!", Toast.LENGTH_SHORT).show();
        }
    }
    private void backF(){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}