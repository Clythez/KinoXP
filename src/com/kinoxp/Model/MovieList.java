package com.kinoxp.Model;

public class MovieList {

    // Fields
    private int movieID;
    private String movieName;
    private String movieGenre;
    private int movieLength;
    private int movieAgeLimit;
    private int movieTicketsReservedPast;
    private int movieTicketsReservedFuture;

    // Constructor
    public MovieList(){
    }

    public MovieList(int movieID){
        this.movieID = movieID;
    }

    public MovieList(int movieID, String movieName, String movieGenre, int movieLength, int movieAgeLimit, int movieTicketsReservedPast, int movieTicketsReservedFuture){
        this.movieID = movieID;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.movieLength = movieLength;
        this.movieAgeLimit = movieAgeLimit;
        this.movieTicketsReservedPast = movieTicketsReservedPast;
        this.movieTicketsReservedFuture = movieTicketsReservedFuture;
    }


    // Getters and setters

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName(){
        return movieName;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public String getMovieGenre(){
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre){
        this.movieGenre = movieGenre;
    }

    public int getMovieLength(){
        return movieLength;
    }

    public void setMovieLength(int movieLength){
        this.movieLength = movieLength;
    }

    public int getMovieAgeLimit(){
        return movieAgeLimit;
    }

    public void setMovieAgeLimit(int movieAgeLimit){
        this.movieAgeLimit = movieAgeLimit;
    }

    public int getMovieTicketsReservedPast(){
        return movieTicketsReservedPast;
    }

    public void setMovieTicketsReservedPast(int movieTicketsReservedPast){
        this.movieTicketsReservedPast = movieTicketsReservedPast;
    }

    public int getMovieTicketsReservedFuture(){
        return movieTicketsReservedFuture;
    }

    public void setMovieTicketsReservedFuture(int movieTicketsReservedFuture) {
        this.movieTicketsReservedFuture = movieTicketsReservedFuture;
    }

}
