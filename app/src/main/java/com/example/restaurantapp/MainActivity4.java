package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView RID = findViewById(R.id.textView29);
        Button goToHome = findViewById(R.id.button4);
        int intValue = generateRandom();
        String str = Integer.toString(intValue);
        RID.setText(str);
        goToHome.setOnClickListener(view -> goToHomeF());
    }
    private int generateRandom(){
        Random random = new Random();
        return random.nextInt((999999999 - 100000000)+1)+ 100000000;
    }
    private void goToHomeF(){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}