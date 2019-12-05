package com.launchcode.java;

import java.lang.reflect.Method;

class Printer<T> {

    public static <E> void printArray(E[] array){
        for (E element : array){
            System.out.println(element + " ");
        }
    }

}
