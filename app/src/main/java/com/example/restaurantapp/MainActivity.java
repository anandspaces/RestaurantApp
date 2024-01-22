package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button reserveTable = findViewById(R.id.button3);
        reserveTable.setOnClickListener(view -> reserveTableF());
    }
    private void reserveTableF(){
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(i);
    }
}