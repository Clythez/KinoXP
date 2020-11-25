package com.kinoxp.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HallTest {

    // Arrange
    Hall hall = new Hall(1,400);

    @Test
    public void getHallId(){
        // Assert
        assertEquals(1,hall.getHallId());
    }

    @Test
    public void setHallId(){
        //Act
        hall.setHallId(2);
        //Assert
        assertEquals(2, hall.getHallId());
    }

    @Test
    public void getNumberOfSeats(){
        //Assert
        assertEquals(400, hall.getNumberOfSeats());
    }

    @Test
    public void setNumberOfSeats(){
        //Act
        hall.setNumberOfSeats(200);
        //Assert
        assertEquals(200, hall.getNumberOfSeats());
    }
}
