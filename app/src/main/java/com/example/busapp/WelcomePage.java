package com.example.busapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class WelcomePage extends AppCompatActivity {

    private BottomNavigationView bootom;
    Fragment selectFragment=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        bootom =findViewById(R.id.bottom_navigation_menu);
        bootom.setOnNavigationItemSelectedListener(ButtonNavMethod);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener ButtonNavMethod= new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId())
                    {
                        case R.id.bottom_navigation_home:
                            selectFragment=new Dashboard_home2();
                            break;
                        case R.id.BookingTab:
                            selectFragment=new SearchBus2();

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmant_container,selectFragment).commit();
                return true;

                }

            };
}


