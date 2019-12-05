package com.launchcode.java;


import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

public class MonorailTestTrack {
    public static <E> void printArray(E[] array){       //putting E between the <>s makes it an object
        for (E element : array){            //for each element in the array of type 'E' (can be anything)
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void day21Challenge(){
        System.out.println();
        System.out.println("Input data: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }


    }

    public static void main(String[] args) {
        //declaring, allocating, and initializing
        Integer[] integerArray1;
        //Integer[] integerArray2 = new Integer[][4];
        //printArray(integerArray2);
        Integer[] integerArray3 = {5, 2, 9, 1, 8};
        //integerArray2[1] = 10;
        String[] shoppingList = {"mushrooms", "ice cream",
                "tennis shoes", "a book", "purple bicycle"};
        //print Arrays
        //System.out.println(Arrays.toString(integerArray2));
        System.out.println(Arrays.toString(integerArray3));
        System.out.println();
        //custom print out arrays
        //printArray(integerArray2);
        //printArray(integerArray3);
        System.out.println();
        //setting values for one of the arrays
        //integerArray2[1] = 10;
        //integerArray2[0] = 8;
        //integerArray2[3] = 4;
        //integerArray2[2] = 5;
        //retrieve objects
        //System.out.println(integerArray2[3]);
        //System.out.println(Array.get(integerArray2, 2));
        System.out.println();
        //Given functions
        Arrays.sort(integerArray3);
        // printArray(integerArray3);
        //Print string array
        printArray(shoppingList);
        //special for loop; foreach
        System.out.println("Special For Loop: ");
        for (String b : shoppingList){
            System.out.println(b);
            System.out.println("What\'s happening?");
        }
        Random ray = new Random();
        System.out.println("Here is a random item I picked out of a hat: ");
        String[]miscellaneousItems = {"shoe", "box", "rubber band", "stop sign", "chair"};
        int randomItem = ray.nextInt(miscellaneousItems.length);
        System.out.println(miscellaneousItems[randomItem]);
        Scanner into = new Scanner(System.in);
        System.out.println("What is the size of the array?");
        int a = into.nextInt();
        int[]aray = new int [a];
        System.out.println("Enter the values for the array.");
        for (int w = 0; w < a; w++){
            aray[w] = into.nextInt();
        }
        System.out.println("Here is the array, yet it's backwards: ");
        for (int w = (aray.length-1); w >= 0; --w){
            System.out.print(aray[w] + " ");
        }
        //day21Challenge();
    }
}
