package com.kinoxp.Model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ShowTest {

    Show show = new Show(1, 1, 1, 65, 10,"2019-10-03 16:15:00");

    @Test
    public void getShowID() {
        // Assert
        Assert.assertEquals(1, show.getShowID());
    }

    @Test
    public void setShowID() {
        // Act
        show.setShowID(2);

        // Assert
        Assert.assertEquals(2, show.getShowID());
    }

    @Test
    public void getMovieID() {
        // Assert
        Assert.assertEquals(1, show.getMovieID());
    }

    @Test
    public void setMovieID() {
        // Act
        show.setShowID(2);

        // Assert
        Assert.assertEquals(1, show.getMovieID());
    }

    @Test
    public void getFee() {
        Assert.assertEquals(10, show.getFee());
    }

    @Test
    public void setFee() {
        show.setFee(5);

        Assert.assertNotEquals(10, show.getFee());
    }



}
