package com.kinoxp.Model;

public class Hall {

    //Fields
    int hallId;
    int numberOfSeats;

    //Constructor
    public Hall(int hallId, int numberOfSeats) {
        this.hallId = hallId;
        this.numberOfSeats = numberOfSeats;
    }

    public Hall(){

    }
    // Getters & Setters
    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
