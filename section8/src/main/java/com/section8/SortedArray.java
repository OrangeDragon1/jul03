package com.section8;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static Scanner scanner = new Scanner(System.in);

    // public static void main(String[] args) {
    //     int[] myNums = getIntegers(5);
    //     int[] sortedNums = sortIntegers(myNums);
    //     printArray(sortedNums);
    // }

    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        for (int k = 0; k < array.length; k++) {
            int input = scanner.nextInt();
            array[k] = input;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d\n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = array;
        boolean stop = false;
        int temp = 0;

        while (!stop) {
            stop = true;
            for (int j = 0; j < sortedArray.length - 1; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                    stop = false;
                } 
                System.out.println(Arrays.toString(sortedArray));
            // Arrays.deepToString(arr) for arrays within array;
            }
        }
        return sortedArray;

    }
}
