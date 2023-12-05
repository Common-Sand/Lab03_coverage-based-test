package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeConditionTest {
    //Tritype.java line 53 if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
    @Test
    public void testTriang(){
        Tritype tri = new Tritype();
        assertEquals(4,tri.Triang(0,1,1));
        assertEquals(4,tri.Triang(1,0,0));

    }
}