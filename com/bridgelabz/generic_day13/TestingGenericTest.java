package com.bridgelabz.generic_day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingGenericTest {
//    static TestingGenericTest tg = new TestingGenericTest();
TestGeneric<Integer> intTG = new TestGeneric();
    TestGeneric<Float> floatTG = new TestGeneric();
    TestGeneric<String> stringTG = new TestGeneric();

    @Test
    void firstMax(){
        Integer max = intTG.maxValue(5,3,2);
        assertEquals(5,max);
    }
    @Test
    void secondMax(){
        int max = intTG.maxValue(5,9,2);
        assertEquals(9,max);
    }
    @Test
    void thirdMax(){
        int max = intTG.maxValue(5,3,8);
        assertEquals(8,max);
    }
    @Test
    void firstFloatMax(){
        float max = floatTG.maxValue(5.2f,3.2f,1.9f);
        assertEquals(5.2f,max);
    }
    @Test
    void secondFloatMax(){
        float max = floatTG.maxValue(5.2f,8.2f,1.9f);
        assertEquals(8.2f,max);
    }
    @Test
    void thirdFloatMax(){
        float max = floatTG.maxValue(5.2f,8.2f,9.9f);
        assertEquals(9.9f,max);
    }
    @Test
    void firstStringMax(){
        String max = stringTG.maxValue("yahoo", "hitman", "virat");
        assertEquals("yahoo",max);
    }
    @Test
    void secondStringMax(){
        String max = stringTG.maxValue("hitman", "yahoo", "virat");
        assertEquals("yahoo",max);
    }
    @Test
    void thirdStringMax(){
        String max = stringTG.maxValue("virat", "hitman", "yahoo");
        assertEquals("yahoo",max);
    }
}