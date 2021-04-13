package com.example.busapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class Dashboard_home2 extends Fragment {

    Button aboutus,whyonlinebooking;
    ImageView menubtn;
    TextView headerrollnumber;

    DrawerLayout drawerLayout;
    private FragmentActivity myContext;
    View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v= inflater.inflate(R.layout.activity_dashboard_home2,container,false);


        menubtn = v.findViewById(R.id.menubtn);
        whyonlinebooking= v.findViewById(R.id.WhyOnlineBookingbtn);
        aboutus = v.findViewById(R.id.aboutus);
        drawerLayout = v.findViewById(R.id.drawerlayout);


        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        NavigationView navigationView;
        navigationView = v.findViewById(R.id.sidenavview);
        navigationView.bringToFront();
        Menu menu= navigationView.getMenu();
        menu.findItem(R.id.seatmagaer).setVisible(false);

        return v;


    }
    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }

}