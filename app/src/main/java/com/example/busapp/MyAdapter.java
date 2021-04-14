package com.example.busapp;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MyAdapter extends FirebaseRecyclerAdapter<Buses,MyAdapter.myviewholder> {



    public MyAdapter(@NonNull FirebaseRecyclerOptions<Buses> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull Buses model) {



        holder.busno.setText(model.getBusno());
        holder.busname.setText(model.getBusname());
        holder.from.setText(model.getDepature());
        holder.to.setText(model.getArrival());
        holder.seats.setText(model.getSeats());
        holder.date.setText(model.getDate());
        holder.depttime.setText(model.getTimedept());
        holder.arrtime.setText(model.getTimearrv());





    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign,parent,false);

        return new MyAdapter.myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img1;
        TextView busno,busname,from,to,seats,date,depttime,arrtime;
        public myviewholder(@NonNull View itemView) {
            super(itemView);

            img1=itemView.findViewById(R.id.img1);
            busno=itemView.findViewById(R.id.busnumber);
            busname=itemView.findViewById(R.id.Busname);
            from=itemView.findViewById(R.id.from);
            to=itemView.findViewById(R.id.to);
            seats=itemView.findViewById(R.id.seats);
            date=itemView.findViewById(R.id.date);
            depttime=itemView.findViewById(R.id.depttime);
            arrtime=itemView.findViewById(R.id.arrtime);
        }
    }


}
