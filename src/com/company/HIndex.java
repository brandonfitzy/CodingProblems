package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HIndex {

//    In academia, the h-index is a metric used to calculate the impact of a researcher's papers. It is calculated as follows:
//    A researcher has index h if at least h of her N papers have h citations each.
//    If there are multiple h satisfying this formula, the maximum is chosen.

    public static void hIndex() {

        ArrayList<Integer> paperArr = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("This program calculates the h-index of a researcher's papers.");
        System.out.println("Please input the number of citations each one of your papers.");
        System.out.println("What is the number of citations of your first paper?");
        String input = sc.nextLine();
        paperArr.add(Integer.valueOf(input));
        boolean done = false;
        while (!done){

            System.out.println("What is the number of citations of your next paper or enter \"done\"?");
            input = sc.nextLine();
            if (input.toLowerCase().contains("done")){
                done = true;
                System.out.println("Calculating h-index...");
            } else {
                paperArr.add(Integer.valueOf(input));
            }
        }

//        paperArr.add(4);
//        paperArr.add(3);
//        paperArr.add(0);
//        paperArr.add(1);
//        paperArr.add(5);

        Collections.sort(paperArr);

        int hIndex = 0;

        for ( int iter = paperArr.size()-1 ; iter >= 0 ; iter-- ){
            int x = paperArr.size()-iter;
            if ( paperArr.get(iter) >= x ){
                hIndex = x;
            } else {
                break;
            }
        }

        System.out.println("You're h-index is " + hIndex);
    }

}
