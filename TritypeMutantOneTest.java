package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutantOneTest {
    @Test
    public void testTriang(){
        TritypeMutantOne tri = new TritypeMutantOne();
        assertEquals(4,tri.Triang(1,1,2));
    }
}