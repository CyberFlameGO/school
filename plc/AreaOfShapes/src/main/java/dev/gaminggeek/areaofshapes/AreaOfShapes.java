package dev.gaminggeek.areaofshapes;

import java.util.Scanner;
import java.util.Set;

public class AreaOfShapes {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      
      Set<String> valid = Set.of("circle", "rectangle");
      System.out.println("What shape would you like to get the area of? Must be one of (\"circle\", \"rectangle\")");
      String shape = scanner.next();
      if (!valid.contains(shape)) {
          System.out.println("That shape is not valid.");
          AreaOfShapes.main(new String[0]);
      }
      
      switch (shape) {
          case "circle": {
              AreaOfShapes.areaOfCircle(scanner);
              break;
          }
          case "rectangle": {
              AreaOfShapes.areaOfRectangle(scanner);
              break;
          }
      }

      System.out.println("Press enter to restart or press CTRL+C to exit");
      try {
        System.in.read();
        AreaOfShapes.main(new String[0]);
      } catch (Exception ignored) {}
    }
    
    private static void areaOfCircle(Scanner scanner) {
        double radius, area, length;
        double pi = 3.14;
      
        System.out.println("Enter the radius below:\n");
        try {
          radius = scanner.nextDouble();
        } catch (Exception e) {
          System.out.println("Input is not a valid double");
          AreaOfShapes.areaOfCircle(scanner);
          return;
        }
        
        System.out.println("The area of the circle is " + radius * radius * pi);
    }
    
    private static void areaOfRectangle(Scanner scanner) {
        double length, width;
        
        System.out.println("Enter the length below:\n");
        try {
          length = scanner.nextDouble();
        } catch (Exception e) {
          System.out.println("Input is not a valid double");
          AreaOfShapes.areaOfRectangle(scanner);
          return;
        }
        
        System.out.println("Enter the width below:\n");
        try {
          width = scanner.nextDouble();
        } catch (Exception e) {
          System.out.println("Input is not a valid double");
          AreaOfShapes.areaOfRectangle(scanner);
          return;
        }
        
        System.out.println("The area of the rectangle is " + length * width);
    }
}