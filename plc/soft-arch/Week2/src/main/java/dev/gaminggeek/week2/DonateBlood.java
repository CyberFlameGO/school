package dev.gaminggeek.week2;

import java.util.Scanner;


public class DonateBlood {
  public static void main(Scanner scanner) {
    int age, weight;

    System.out.println("Enter your age:");
    age = scanner.nextInt();

    if (age < 18) {
      System.out.println("You must be at least 18 to donate blood.");
      return;
    }

    System.out.println("Enter your weight:");
    weight = scanner.nextInt();

    if (age >= 18 && weight > 50)
      System.out.println("You are eligible to donate blood!");
    else
      System.out.println("Weight must be greater than 50 to donate blood.");
  }
}