package com.company;

public class MaxAndMinFinder {



    public static void maxAndMinFInder(){
        int[] arr= {1,2,3,4,5};
        int min = arr[0];
        int max = arr[1]
        int counter = 0;

        for (int index = 2; index < arr.length ; index++) {
            if (max < arr[index]){
                counter++;
                max = arr[index];
            } else {
                if (min > arr[index]){
                    counter++;
                    min = arr[index];
                }

            }
        }

        System.out.println(arr);
        System.out.println("Smallest int = " + min);
        System.out.println("Largest int = " + max);
        System.out.println("Num of comparisons = " + counter);
    }
}
