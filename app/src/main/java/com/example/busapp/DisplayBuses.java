package com.example.busapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DisplayBuses extends AppCompatActivity {


   private RecyclerView recview;
    MyAdapter adapter;
    DatabaseReference mbase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_buses);

        mbase=FirebaseDatabase.getInstance().getReference().child("Buses");
        recview=(RecyclerView)findViewById(R.id.recview);

        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<Buses> options =
                new FirebaseRecyclerOptions.Builder<Buses>()
                        .setQuery(mbase, Buses.class)
                        .build();

        adapter=new MyAdapter(options);
        recview.setAdapter(adapter);

    }
    @Override protected void onStart()
    {
        super.onStart();
        adapter.startListening();
    }

    // Function to tell the app to stop getting
    // data from database on stoping of the activity
    @Override protected void onStop()
    {
        super.onStop();
        adapter.stopListening();
    }
}