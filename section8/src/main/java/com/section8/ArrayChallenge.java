package com.section8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] myIntegers = getIntegers(5);
        System.out.println("Integers before sorting: ");
        printArray(myIntegers);
        int[] sorted = sortIntegers(myIntegers);
        System.out.println("Integers after sorting: ");
        printArray(sorted);

    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.printf("Please enter %d integers: \n", capacity);
        for(int i = 0; i < array.length; i++) {
            System.out.print(">> ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("At index %d, the integer is %d. \n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        // int[] sortedArray = new int[array.length];
        // // for (int i = 0; i < array.length; i++) {
        // //     sortedArray[i] = array[i];
        // // }
        // // or 
        // int[] sortedArray = array;
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            // integers = 50,60,20,10,80
            // first iteration with i = 0, as 50 < 60 == true, they will swap places, now array looks like 60,50,20,10,80
            // second iteration with i = 1, as 50 < 20 == false, nothing happens
            // third iteration with i = 2, as 20 < 10 == false, nothing happens
            // fourth iteration with i = 3, as 10 < 80 == true, they will swap places, now array looks like 60,50,20,80,10
            // .length - 1 was used because there is not index 5 for index 4 to compare against
            // for loop restarted to 0 to check 60,50,20,80,10
            // when array is properly sorted to 80,60,50,20,10, if statement will not run because conditions will return false
            // as flag is false, we get kicked out of the for loop
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
