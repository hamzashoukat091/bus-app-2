package com.example.busapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminPannel extends AppCompatActivity {

    Button b1,b2,b3;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_pannel);
    b1=(Button)findViewById(R.id.b1);
    b2=(Button)findViewById(R.id.b2);
    b3=(Button)findViewById(R.id.b3);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            
        }
    });


    }
}