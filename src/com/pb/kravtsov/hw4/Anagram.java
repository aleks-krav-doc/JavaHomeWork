package com.pb.kravtsov.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter the string(1):");
        String str1 = in.nextLine();
        System.out.println ("Enter the string(2):");
        String str2 = in.nextLine();
        String st1 = str1.replaceAll("[^a-zA-Z-а-яёА-ЯЁ]","");
        String st2 = str2.replaceAll("[^a-zA-Z-а-яёА-ЯЁ]","");
        st1 = st1.toLowerCase();
        st2 = st2.toLowerCase();
        char[] chAr1 = st1.toCharArray();
        char[] chAr2 = st2.toCharArray();
        //Arrays.sort(chAr1);
        //Arrays.sort(chAr2);
        boolean rez = false;

        for (int i = chAr1.length-1 ; i > 0 ; i--) {
            for (int j = 0 ; j < i ; j++) {
            if ( chAr1[j] > chAr1[j+1] ) {
                int tmp = chAr1[j];
                chAr1[j] = chAr1[j+1];
                chAr1[j+1] = (char) tmp;
            }
        }
        }
        //st1 = new String(chAr1);
        //System.out.println("Result:"+ st1);

        for (int i = chAr2.length-1 ; i > 0 ; i--) {
            for (int j = 0 ; j < i ; j++) {
                if ( chAr2[j] > chAr2[j+1] ) {
                    int tmp = chAr2[j];
                    chAr2[j] = chAr2[j+1];
                    chAr2[j+1] = (char) tmp;
                }
            }
        }
        //st2 = new String(chAr2);
        //System.out.println("Result:"+ st2);

        if (st1.length() != st2.length()) {
            System.out.println ("This is not an anagram");
        }
        else
        {
            for (int i = 0; i < st1.length(); i++) {
                if (chAr1 [i] == chAr2 [i]){
                    rez = true;
                    continue;
                }
                else {
                    System.out.println ("This is not an anagram");
                    rez = false;
                    break;
                }

            }

        }
        if (rez == true) {
        System.out.println ("THIS IS ANAGRAM!");
        }

    }
}
