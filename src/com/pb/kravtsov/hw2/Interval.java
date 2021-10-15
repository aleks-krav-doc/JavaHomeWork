package com.pb.kravtsov.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input integer: ");
        int operand1 = in.nextInt();
        if (operand1 >= 0 && operand1 <= 14) {
            System.out.println("Number in the interval [0 -14]");
        }
        if (operand1 >= 15 && operand1 <= 35) {
            System.out.println("Number in the interval [15 - 35]");
        }
        if (operand1 >= 36 && operand1 <= 50) {
            System.out.println("Number in the interval [36 - 50]");
        }
        if (operand1 >= 51 && operand1 <= 100) {
            System.out.println("Number in the interval [51 - 100]");
        }
        if (operand1 >= 101) {
            System.out.println("Number is not included in the specified intervals");
        }
    }
}
