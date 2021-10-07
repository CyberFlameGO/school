package dev.gaminggeek.week2;

import java.util.Scanner;

public class IfElse {
  public static void main(Scanner scanner) {
    System.out.println("Enter a number:");
    int num = scanner.nextInt();
    String numStr = String.valueOf(num);
    if (numStr.startsWith("-"))
      num = Integer.parseInt(numStr.substring(1)); // big brain plays right here

    if (num > 0 && num <= 10)
      System.out.println("That number is a single digit");
    else if (num < 100)
      System.out.println("That number is two digits long");
    else if (num < 1000)
      System.out.println("That number is three digits long");
  }
}