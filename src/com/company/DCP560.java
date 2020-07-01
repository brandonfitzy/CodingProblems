package com.company;

import java.util.Scanner;

public class DCP560 {

    //function to determine if any two numbers in a given array sum to any given int k


    public static boolean arrSum(int k, int[] arr){
        boolean doTheySum = false;
        for (int i = 0 ; i < arr.length-1 ; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                if ( arr[i] + arr[j] == k){
                    doTheySum = true;
                }
            }
        }
        System.out.println(doTheySum);
        return doTheySum;
    }

}
