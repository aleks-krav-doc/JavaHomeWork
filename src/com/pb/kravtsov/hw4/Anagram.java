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
        Arrays.sort(chAr1);
        Arrays.sort(chAr2);
        boolean rez = false;

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
