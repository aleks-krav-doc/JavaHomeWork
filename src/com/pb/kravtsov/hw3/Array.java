package com.pb.kravtsov.hw3;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        int x = array.length;
        Scanner in = new Scanner(System.in);

        System.out.println("Fill an array_" + x + "_of numbers");
        for (int i=0; i < x; i++) {
            System.out.println("Enter array number"+ (i+1) +":");
            array[i] = in.nextInt();
        }

        System.out.println("Filled array");
        for (int i=0; i < x; i++) {
            System.out.print(array[i]+",");
        }

        int sum = 0;
        for (int i=0; i < x; i++) {
        sum += array[i];
        }
        System.out.println("Sum of array elements:" + sum);

        int positive = 0;
        int negative = 0;
        for (int i=0; i < x; i++) {
            if (array[i]>0) {
            positive++;
            }
            else  {
            negative++;
        }
        }
       System.out.println("The number of positive elements of the array:" + positive);

        boolean sorted = false;
        int buf;
        while(!sorted) {
              sorted = true;
              for (int i=0; i < x-1; i++) {
                 if (array[i]>array[i+1]) {
                     sorted = false;

                     buf = array[i];
                     array[i] = array[i+1];
                     array[i+1] = buf;
    }
    }
    }
        System.out.println("Filled array Bubble");
        for (int i=0; i < x; i++) {
            System.out.print(array[i]+",");
    }
    }
}