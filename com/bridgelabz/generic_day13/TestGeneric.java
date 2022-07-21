package com.bridgelabz.generic_day13;

public class TestGeneric<T extends Comparable<T>> {

    private T num1,num2,num3;

    public TestGeneric(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public TestGeneric(){}
    public T maxValue(T num1, T num2, T num3){

        if(num1.compareTo(num2)>0){
            if(num1.compareTo(num3)>0){
                return num1;
            }else{
                return num3;
            }
        }else{
            if(num2.compareTo(num3)>0){
                return num2;
            }else {
                return num3;
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("Greatest of 3 number ");

        Integer num1=50, num2=100, num3=20;
        TestGeneric<Integer> intObj = new TestGeneric<>();
        Integer max = intObj.maxValue(num1, num2, num3);
        System.out.println("Max number between "+num1+", "+num2+" and "+num3+" is "+max);

        TestGeneric<Float> floatObj = new TestGeneric<>();
        Float numF1=50.6f, numF2=100.9f, numF3=20.9f;
        Float maxFloat =    floatObj.maxValue(numF1, numF2, numF3);
        System.out.println("Max number between "+numF1+", "+numF2+" and "+numF3+" is "+maxFloat);

        String str1="hello", str2="yahoo", str3="goat";
        TestGeneric<String> strObj = new TestGeneric<>();
        String maxString = strObj.maxValue(str1, str2, str3);
        System.out.println("Max String among--> "+str1+", "+str2+" and "+str3+" is "+maxString);

    }
}
