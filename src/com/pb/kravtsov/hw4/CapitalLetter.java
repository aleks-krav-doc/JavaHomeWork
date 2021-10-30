package com.pb.kravtsov.hw4;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter the string:");
        String str1 = in.nextLine();
        String str2 = "";
        str2 = str1.substring(0, 1).toUpperCase();

        for (int i = 1; i < str1.length(); i++) {
            if (" ".equals(str1.substring(i-1,i)))
                str2 = str2 + str1.substring(i, i+1).toUpperCase();
            else
                str2 = str2 + str1.substring(i, i+1);
        }

        System.out.println("Result:"+ str2);

    }
}