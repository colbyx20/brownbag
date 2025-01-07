package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;

public class AppTest {

    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void testRun() {
        app.run();
        HashMap<Integer, Data> mymap = app.mymap;

        // Check if the map contains the expected keys
        assertTrue(mymap.containsKey(1));
        assertTrue(mymap.containsKey(2));

        // Check if the map contains the expected values
        assertEquals("Data{Id=1, user=name1}", mymap.get(1).toString());
        assertEquals("Data{Id=2, user=name2}", mymap.get(2).toString());
    }
}
