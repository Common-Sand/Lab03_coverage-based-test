package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {
    //Tritype.java line 83  else if (triOut == 1 && Side1+Side2 > Side3)
    @Test
    public void testTriang(){
        Tritype tri = new Tritype();
        assertEquals(2,tri.Triang(5,5,6));
        assertEquals(4,tri.Triang(5,5,10));
        assertEquals(2,tri.Triang(5,6,5));
    }
}