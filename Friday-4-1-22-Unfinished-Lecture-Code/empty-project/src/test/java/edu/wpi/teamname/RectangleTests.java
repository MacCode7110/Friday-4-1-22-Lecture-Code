package edu.wpi.teamname;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTests {

    @Test
    public void testGetPerimeter1()
    {
        Rectangle r = new Rectangle(1,1);
        assertEquals(r.getPerimeter(), 1);
    }
}
