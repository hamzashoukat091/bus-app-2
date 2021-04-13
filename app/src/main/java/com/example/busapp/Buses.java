package com.example.busapp;

public class Buses  {

    int busno;
    String busname;
    String Depature;
    String Arrival;
    int seats;
    String date;
    String timedept;
    String timearrv;

    public Buses(int busno, String busname, String depature, String arrival, int seats, String date, String timeDeparture, String timeArrival) {
        this.busno = busno;
        this.busname = busname;
        this.Depature = depature;
       this.Arrival = arrival;
        this.seats = seats;
        this.date = date;
        this.timedept = timeDeparture;
        this.timearrv = timeArrival;
    }

    public int getBusno() {
        return busno;
    }

    public String getBusname() {
        return busname;
    }

    public String getDepature() {
        return Depature;
    }

    public String getArrival() {
        return Arrival;
    }

    public int getSeats() {
        return seats;
    }

    public String getDate() {
        return date;
    }

    public String getTimedept() {
        return timedept;
    }

    public String getTimearrv() {
        return timearrv;
    }
}

