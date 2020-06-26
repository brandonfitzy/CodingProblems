package com.company;

public class DCP556 {
    public static boolean canArrayBeDescendingIfOneElementIsChange(int[] arr) {
        //Given an array of integers,
        //write a function to determine
        //whether the array could become non-decreasing
        //by modifying at most 1 element.

        System.out.println("This program takes any array and returns true if one element is out of descending order");

        boolean onlyOne = false;
        int elementIndex = 0;
        int outOfOrderCounter = 0;

        for (int arrIter = 0 ; arrIter < arr.length - 1 ; arrIter++){
            for ( int arrCompare = arrIter + 1 ; arrCompare < arr.length ; arrCompare++){
                if (arr[arrIter] < arr[arrCompare]){
                    outOfOrderCounter++;
                    elementIndex = arrIter;
                }
            }
        }

        if (outOfOrderCounter == 1) {
            onlyOne = true;
            System.out.println(onlyOne);
            System.out.println("Element at index " + elementIndex + " equal to " + arr[elementIndex] + " is out of descending order");
        } else if (outOfOrderCounter == 0){
            System.out.println(onlyOne);
            System.out.println("Array is already sorted");
        } else {
            System.out.println(onlyOne);
            System.out.println("Array has more than one element out of order");
        }


        return onlyOne;

    }
}
