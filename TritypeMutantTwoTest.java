package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutantTwoTest {
    @Test
    public void testTriang(){
        TritypeMutantTwo tri = new TritypeMutantTwo();
        assertEquals(4,tri.Triang(1,1,2));
    }
}