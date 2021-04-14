package com.example.busapp;

public class Buses  {

    String busno;
    String busname;
    String Depature;
    String Arrival;
    String seats;
    String date;
    String timedept;
    String timearrv;
        public Buses()
    {

    }


    public Buses(String busno, String busname, String depature, String arrival, String seats, String date, String timeDeparture, String timeArrival) {
        this.busno = busno;
        this.busname = busname;
        this.Depature = depature;
       this.Arrival = arrival;
        this.seats = seats;
        this.date = date;
        this.timedept = timeDeparture;
        this.timearrv = timeArrival;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public void setDepature(String depature) {
        Depature = depature;
    }

    public void setArrival(String arrival) {
        Arrival = arrival;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTimedept(String timedept) {
        this.timedept = timedept;
    }

    public void setTimearrv(String timearrv) {
        this.timearrv = timearrv;
    }

    public String getBusno() {
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

    public String getSeats() {
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

