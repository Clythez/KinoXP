package com.kinoxp.Model;

import java.util.Date;

public class Show {

    //fields
    private int showID;
    private int movieID;
    private int hallID;
    private double price;
    private int fee;
    //formatting for Date
    //java.util.Date dt = new java.util.Date();
    //java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private String fromTime; //= sdf.format(dt);

    // Constructor containing all fields
    public Show(int showID, int movieID, int hallID, double price, int fee, String fromTime) {
        this.showID = showID;
        this.movieID = movieID;
        this.hallID = hallID;
        this.price = price;
        this.fee = fee;
        this.fromTime = fromTime;
    }

    // constructor used when initialising the show object from GUI.
    public Show(int movieID, int hallID, double price, int fee, String fromTime) {
        this.movieID = movieID;
        this.hallID = hallID;
        this.price = price;
        this.fee = fee;
        this.fromTime = fromTime;
    }

    // Default constructor
    public Show(){}


    // Getters and Setters

    public int getShowID() {
        return showID;
    }

    public void setShowID(int showID) {
        this.showID = showID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public int getHallID() {
        return hallID;
    }

    public void setHallID(int hallID) {
        this.hallID = hallID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
