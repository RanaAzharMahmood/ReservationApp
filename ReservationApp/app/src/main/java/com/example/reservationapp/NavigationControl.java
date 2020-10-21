package com.example.reservationapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NavigationControl extends AppCompatActivity  {

    FragmentTransaction fragmentTransaction;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_control);





        BottomNavigationView bottomNavigationView= findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(navList);

        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragement,new HomeFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navList=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.page_1:
                    fragment = new HomeFragment();
                    break;
                case R.id.page_2:
                    fragment = new AboutUs();
                    break;
                case R.id.page_3:
                    fragment = new Offers();
                    break;
                case R.id.page_4:
                    fragment=new AdminApproval();
                    break;
                case R.id.page_5:
                    fragment=new Contact();
                    break;

            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragement,fragment).commit();
            return true;

        }
    };

}
