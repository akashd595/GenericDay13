package com.bridgelabz.generic_day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingGenericTest {
    @Test
    void firstMax(){
        TestGeneric tg = new TestGeneric();
        int max = TestGeneric.maxValue(5,3,2);
        assertEquals(5,max);
    }
    @Test
    void secondMax(){
        TestGeneric tg = new TestGeneric();
        int max = TestGeneric.maxValue(5,9,2);
        assertEquals(9,max);
    }
    @Test
    void thirdMax(){
        TestGeneric tg = new TestGeneric();
        int max = TestGeneric.maxValue(5,3,8);
        assertEquals(8,max);
    }
    @Test
    void firstFloatMax(){
        float max = TestGeneric.maxValue(5.2f,3.2f,1.9f);
        assertEquals(5.2f,max);
    }
    @Test
    void secondFloatMax(){
        float max = TestGeneric.maxValue(5.2f,8.2f,1.9f);
        assertEquals(8.2f,max);
    }
    @Test
    void thirdFloatMax(){
        float max = TestGeneric.maxValue(5.2f,8.2f,9.9f);
        assertEquals(9.9f,max);
    }
    @Test
    void firstStringMax(){
        String max = TestGeneric.maxValue("yahoo", "hitman", "virat");
        assertEquals("yahoo",max);
    }
    @Test
    void secondStringMax(){
        String max = TestGeneric.maxValue("hitman", "yahoo", "virat");
        assertEquals("yahoo",max);
    }
    @Test
    void thirdStringMax(){
        String max = TestGeneric.maxValue("virat", "hitman", "yahoo");
        assertEquals("yahoo",max);
    }
}