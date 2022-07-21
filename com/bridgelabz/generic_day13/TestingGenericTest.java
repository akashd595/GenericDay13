package com.bridgelabz.generic_day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingGenericTest {
    @Test
    void firstMax(){
        TestGeneric tg = new TestGeneric();
        int max = TestGeneric.maxNumber(5,3,2);
        assertEquals(5,max);
    }
    @Test
    void secondMax(){
        TestGeneric tg = new TestGeneric();
        int max = TestGeneric.maxNumber(5,9,2);
        assertEquals(9,max);
    }
    @Test
    void thirdMax(){
        TestGeneric tg = new TestGeneric();
        int max = TestGeneric.maxNumber(5,3,8);
        assertEquals(8,max);
    }
}