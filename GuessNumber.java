package com.company;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
          Random random = new Random();
          int number = random.nextInt(100) +1;
          System.out.println("Enter the guessed number");
          Scanner sc = new Scanner(System.in);
          int count = 1;
          while(true){
              int guessNumber = sc.nextInt();
              if(guessNumber == number){
                  System.out.println("Congrats!!! You have guessed it correctly at your "+ count +" attempt.");
                  break;
              }else if(guessNumber>number){
                  System.out.println("Too high");

              }else{
                  System.out.println("Too low");

              }
              count++;
          }
    }
}
