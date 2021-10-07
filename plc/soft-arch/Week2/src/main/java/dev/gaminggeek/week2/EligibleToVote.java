package dev.gaminggeek.week2;

import java.util.Scanner;

class EligibleToVote {

  public static void main(Scanner scanner) {
    System.out.println("Enter your age:");
    int age = scanner.nextInt();
    if (age >= 18) 
      System.out.println("You are eligible to vote!");
    else {
      int canVoteIn = 18 - age;
      System.out.println("You are not currently eligible to vote! You can vote in " + canVoteIn + " years.");
    }
  }
}
