package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class DeDup {

    public static void main(String[] args) {

        int[] randomIntegers = {1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4, 9, 3,
                20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6, 19,
                13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11};

        DeDup deDup = new DeDup();
        int[] result;

        System.out.println("\nResult from function removing duplicate and keeping same order");

        result = deDup.removeDuplicateInOriginalOrder(randomIntegers);

        for (int i : result) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("Result from function removing duplicate and avoid negative number");
        result = deDup.removeDuplicateAvoidNegative(randomIntegers);

        for (int i : result) {
            System.out.print(i+" ");
        }

        System.out.println("\n");

        System.out.println("Result from function removing duplicate in sorted order");
        result = deDup.removeDuplicateInSortedOrder(randomIntegers);

        for (int i : result) {
            System.out.print(i+" ");
        }


    }


    /**
     * @param arr integer input array
     * @return an array removing duplicate digit from input array
     */

    public int[] removeDuplicateInOriginalOrder(int arr[]) {

        if(arr==null || arr.length<2){
            return arr;
        }

        Set<Integer> numbers = new LinkedHashSet<Integer>();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            numbers.add(arr[i]);
        }

        int[] newArray = new int[numbers.size()];

        for (int i : numbers) {
            newArray[index++] = i;
        }

        return newArray;
    }



    /**
     * @param arr integer input array
     * @return an array removing duplicate and negative digit of input array
     */

    public int[] removeDuplicateAvoidNegative(int arr[]) {

        if (arr == null || arr.length < 2) {
            return arr;
        }

        Set<Integer> numbers = new LinkedHashSet<Integer>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0) {
                numbers.add(arr[i]);
                count++;
            }
        }

        int[] newArray = new int[numbers.size()];
        System.out.println("Positive numbers count: " + count);
        System.out.println("Negative numbers count: " + (arr.length - count));

        int index = 0;
        for (int i : numbers) {
            newArray[index++] = i;
        }

        return newArray;
    }


    /**
     * @param arr integer input array
     * @return a sorted array removing duplicate digit of input array
     */
    public int[] removeDuplicateInSortedOrder(int arr[]) {

        if (arr == null || arr.length < 2) {
            return arr;
        }

        int i = 0;

        int[] newArray=Arrays.copyOf(arr, arr.length );
        Arrays.sort(newArray);

        for (int j = 1; j < newArray.length; j++) {

            if (newArray[i] != newArray[j]) {
                newArray[++i] = newArray[j];
            }
        }

        newArray = Arrays.copyOf(newArray, i + 1);

        return newArray;
    }

}
