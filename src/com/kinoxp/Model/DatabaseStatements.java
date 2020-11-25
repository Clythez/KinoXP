package com.kinoxp.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseStatements {

    //    Declare a Statement
    private static Statement statement = null;

    //    Declare & create a connection
    private static Connection connection = DatabaseConnector.connect();

    //    Declare a result set
    private static ResultSet resultSet = null;

    private static final String DATABASE = "kino_xp_db";


    public static void insertIntoMovies(String table, String movieName, String genre, int length, int ageLimit) {
        // SQL statement
        String query = "INSERT INTO " + table + "(movie_name, genre, length, age_limit)" + " VALUES('" + movieName + "','" + genre + "'," + length + "," + ageLimit + ");";

        try {

            statement = connection.createStatement();

            statement.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //method for accessing the movie information in the database
    public static String[] queryMovieInformation(int movieId) {
        String query = "SELECT * FROM movies WHERE movie_id = " + movieId +";";
        ResultSet rs;
        String[] movieDetails = new String[7];
        try{

            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            rs.next();
            movieDetails[0] = rs.getString("movie_id");
            movieDetails[1] = rs.getString("movie_name");
            movieDetails[2] = rs.getString("length");
            movieDetails[3] = rs.getString("genre");
            movieDetails[4] = rs.getString("age_limit");
            movieDetails[5] = rs.getString("tickets_reserved_past");
            movieDetails[6] = rs.getString("tickets_reserved_future");

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return movieDetails;
    }

//    Method to use a database
        public static void useDB() {

//    SQL statement
            String query = "use " + DATABASE + ";";
            try {

//    Create statement
                statement = connection.createStatement();

//    Execute statement
                statement.executeUpdate(query);
                System.out.println("\n---Using " + DATABASE +  "---");
            }

//    Handle sql exceptions
            catch(SQLException ex) {
                System.out.println("\n---Statement did not execute---");
                ex.printStackTrace();
        }
    }

    public static ArrayList<String> getTimes(int movieID) {
        ArrayList<String> list = new ArrayList<>();
        String query = "SELECT from_time FROM shows WHERE movie_id =" + movieID + " ORDER BY from_time" + ";";

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                list.add(resultSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void insertIntoShows(Show show) {


        String query = "INSERT INTO shows (movie_id, from_time, hall_id, price, fee_id) VALUES(" +
                show.getMovieID() + ", '" + show.getFromTime() + "', " + show.getHallID() + ", " + show.getPrice() +
                ", " + show.getFee() + ");";

        try {

            statement = connection.createStatement();

            statement.executeUpdate(query);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
