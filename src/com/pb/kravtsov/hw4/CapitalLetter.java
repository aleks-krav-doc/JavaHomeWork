package com.pb.kravtsov.hw4;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter the string:");
        String str1 = in.nextLine();
        char[] chAr1 = str1.toCharArray();
        String str2 = "";

        for (int i = 0; i < chAr1.length; i++) {
            if (chAr1[i] == ' ') {
                chAr1[i+1] = Character.toUpperCase(chAr1[i+1]);
            }
        }
        chAr1[0] = Character.toUpperCase(chAr1[0]);
        str2 = new String(chAr1);
        System.out.println("Result:"+ str2);
        }
}