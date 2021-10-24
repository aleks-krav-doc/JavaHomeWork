package com.pb.kravtsov.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int attempt = 0;
        int x = random.nextInt(101);
       // System.out.println("rand x:" + x);

        while ( x!=777 ) {
            System.out.println("FOR EXIT input number 777: ");
            attempt++;
            System.out.println("Attempt " + attempt + ":");
            System.out.println("Input number 0-100: ");
            Scanner in = new Scanner(System.in);
            int y = in.nextInt();

        if ( y==777 ) {
            break;
        }

        if ( y==x ) {
            System.out.println(" You guessed!!! The Attempt №" + attempt +":");
            break;
        }

        if ( y>x ) {
            System.out.println(" You didn't guess! You number > the hidden number");
        }
        else  {
            System.out.println(" You didn't guess! You number < the hidden number");

        }

        }
        System.out.println("!!!End of the game!!!");
    }

 }
