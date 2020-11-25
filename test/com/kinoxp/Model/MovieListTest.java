package com.kinoxp.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieListTest {

    // Arrange
    MovieList movieList = new MovieList(1, "Star wars", "Action", 150, 18, 10, 20);

    @Test
    void getMovieID() {
        // Assert
        assertEquals(1, movieList.getMovieID());
    }

    @Test
    void setMovieID() {
        // Act
        movieList.setMovieID(2);
        // Assert
        assertEquals(2, movieList.getMovieID());
    }

    @Test
    void getMovieName() {
        // Assert
        assertEquals("Star wars", movieList.getMovieName());
    }

    @Test
    void setMovieName() {
        // Act
        movieList.setMovieName("Star trek");
        // Assert
        assertEquals("Star trek", movieList.getMovieName());
    }

    @Test
    void getMovieGenre() {
        // Assert
        assertEquals("Action", movieList.getMovieGenre());
    }

    @Test
    void setMovieGenre() {
        // Act
        movieList.setMovieGenre("Romance");
        // Assert
        assertEquals("Romance", movieList.getMovieGenre());
    }

    @Test
    void getMovieLength() {
        // Assert
        assertEquals(150, movieList.getMovieLength());
    }

    @Test
    void setMovieLength() {
        // Act
        movieList.setMovieLength(170);
        // Assert
        assertEquals(170, movieList.getMovieLength());
    }

    @Test
    void getMovieAgeLimit() {
        // Assert
        assertEquals(18,movieList.getMovieAgeLimit());
    }

    @Test
    void setMovieAgeLimit() {
        // Act
        movieList.setMovieAgeLimit(15);
        // Assert
        assertEquals(15, movieList.getMovieAgeLimit());
    }

    @Test
    void getMovieTicketsReservedPast() {
        // Assert
        assertEquals(10, movieList.getMovieTicketsReservedPast());
    }

    @Test
    void setMovieTicketsReservedPast() {
        // Act
        movieList.setMovieTicketsReservedPast(20);
        // Assert
        assertEquals(20,movieList.getMovieTicketsReservedPast());
    }

    @Test
    void getMovieTicketsReservedFuture() {
        // Assert
        assertEquals(20, movieList.getMovieTicketsReservedFuture());
    }

    @Test
    void setMovieTicketsReservedFuture() {
        // Act
        movieList.setMovieTicketsReservedFuture(30);
        // Assert
        assertEquals(30, movieList.getMovieTicketsReservedFuture());
    }
}