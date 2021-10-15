package com.pb.kravtsov.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result;
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int operand1 = in.nextInt();

        System.out.println("Input second number: ");
        int operand2 = in.nextInt();

        System.out.println("Operator (+,-,*,/):");
        String Operator = in.next();

        switch (Operator) {
            case "-":
                result = operand1 - operand2;
                break;
            case "+":
                result = operand1 + operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
            if ( operand2 == 0) {
                System.out.println("Argument 'divisor' is 0");
            }
            result = operand1 / operand2;
            break;
            default:
                result = 0;
        }
        System.out.println("Результат: " + result);
    }
}

