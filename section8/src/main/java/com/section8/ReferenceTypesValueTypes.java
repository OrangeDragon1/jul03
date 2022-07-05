package com.section8;

import java.util.Arrays;

public class ReferenceTypesValueTypes {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; // theres no new array, anotherArray is just referencing from myIntArray

        System.out.println(Arrays.toString(myIntArray));
    }
}
