package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeTest {
    @Test
    public void testTriang(){
        Tritype tri = new Tritype();
        assertEquals(4,tri.Triang(2,1,1));
        assertEquals(4,tri.Triang(0,0,0));
        assertEquals(4,tri.Triang(1,2,3));
        assertEquals(3,tri.Triang(5,5,5));
        assertEquals(2,tri.Triang(6,5,5));
        assertEquals(2,tri.Triang(5,5,6));
        assertEquals(2,tri.Triang(5,6,5));
        assertEquals(1,tri.Triang(3,4,5));
    }

}