package com.bridgelabz.generic_day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingGenericTest {

    @Test
    void firstMax(){
        TestGeneric<Integer> intTG = new TestGeneric(5,3,2);
        Integer max = intTG.maxValue();
        assertEquals(5,max);
    }
    @Test
    void secondMax(){
    TestGeneric<Integer> intTG = new TestGeneric(5,9,2);
        int max = intTG.maxValue();
        assertEquals(9,max);
    }
    @Test
    void thirdMax(){
        TestGeneric<Integer> intTG = new TestGeneric(5,3,8);

        int max = intTG.maxValue();
        assertEquals(8,max);
    }
    @Test
    void firstFloatMax(){
          TestGeneric<Float> floatTG = new TestGeneric(5.2f,3.2f,1.9f);
        float max = floatTG.maxValue();
        assertEquals(5.2f,max);
    }
    @Test
    void secondFloatMax(){
          TestGeneric<Float> floatTG = new TestGeneric(5.2f,8.2f,1.9f);
        float max = floatTG.maxValue();
        assertEquals(8.2f,max);
    }
    @Test
    void thirdFloatMax(){
          TestGeneric<Float> floatTG = new TestGeneric(5.2f,8.2f,9.9f);
        float max = floatTG.maxValue();
        assertEquals(9.9f,max);
    }
    @Test
    void firstStringMax(){
    TestGeneric<String> stringTG = new TestGeneric("yahoo", "hitman", "virat");

        String max = stringTG.maxValue();
        assertEquals("yahoo",max);
    }
    @Test
    void secondStringMax(){
    TestGeneric<String> stringTG = new TestGeneric("hitman", "yahoo", "virat");

        String max = stringTG.maxValue();
        assertEquals("yahoo",max);
    }
    @Test
    void thirdStringMax(){
    TestGeneric<String> stringTG = new TestGeneric("virat", "hitman", "yahoo");
        String max = stringTG.maxValue();
        assertEquals("yahoo",max);
    }
}