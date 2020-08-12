package com.company;

public class PythagoreanTripleFinder {

    //Given an array of integers, determine whether it contains a Pythagorean triplet.

    public static int[] PythogareanTripleFinder(int[] numArr){
        int a; int b; int c;
        int[] pTriple = new int[3];

        if ((a^2)+(b^2) == (c^2)){
            pTriple[0] = a;
            pTriple[1] = b;
            pTriple[2] = c;
            System.out.println("There is a Pythagorean Triple: a = "+a+", b = "+b+", c = "+c);
        } else {



        return pTriple;
    }

}
