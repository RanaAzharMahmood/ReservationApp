package com.example.reservationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DatabaseActivity extends AppCompatActivity {

    LinearLayout line1, line2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

    init();
    createDynamicCard();

    }

    private void createDynamicCard() {

        ImageView imageView=new ImageView(this);
        imageView.setwid


    }

    private void init() {
        line1=findViewById(R.id.line1);
        line2=findViewById(R.id.line2);
    }
}