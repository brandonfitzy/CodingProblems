package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FibSeq {

    public static ArrayList<Integer> fibSeq(int positions){

        ArrayList<Integer> fibseq = new ArrayList<>();
        fibseq.add(0);
        System.out.println(fibseq.get(0));
        fibseq.add(1);
        System.out.println(fibseq.get(1));

        for (int iter = 2; iter < positions; iter++){
            fibseq.add(fibseq.get(iter - 2) + fibseq.get(iter - 1));
            System.out.println(fibseq.get(iter));
        }

        return fibseq;
    }
}
