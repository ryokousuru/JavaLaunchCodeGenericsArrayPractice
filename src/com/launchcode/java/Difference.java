package com.launchcode.java;

import java.util.Arrays;

public class Difference {
    private int[] elements;
    public int maximumDifference;
    // Add your code here
    Difference(int[] a){
        elements = a;
    }
    public void computeDifference(){
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
    }
}
