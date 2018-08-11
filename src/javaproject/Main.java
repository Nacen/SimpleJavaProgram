package javaproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;

        do {
            System.out.println("MENU: ");
            System.out.println();
            System.out.println("[A]Sequence Statement       [B}If-else Statement");
            System.out.println("[C]Else-if Statement        [D}Switch Statement");
            System.out.println("[E]While Loop               [F}Do While loop");
            System.out.println("[G]For Loop");
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("A")) {
                success = true;
                System.out.println("Sequence Statement Program");
                System.out.print("Enter your name: ");
                String nameInput = scanner.next();
                System.out.println("Hello and Welcome " + nameInput);
            }
            else if (input.equalsIgnoreCase("B")) {
                success = true;
                System.out.println("If-else Statement Program");
                System.out.println("Odd or Even Checker");
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                if (number % 2 == 0) {
                    System.out.println("Number is Even");
                }
                else {
                    System.out.println("Number is Odd");
                }
            }
            else if (input.equalsIgnoreCase("C")) {
                success = true;
                System.out.println("Else-if Statement Program");
                System.out.println("Strength Meter 1-10");
                System.out.print("What's your strength: ");
                int strengthNum = scanner.nextInt();
                if (strengthNum < 1 || strengthNum > 10) {
                    System.out.println("Invalid Input Try again");
                }
                else if (strengthNum < 3) {
                    System.out.println("You are too weak");
                }
                else if (strengthNum == 5) {
                    System.out.println("You have an average strength");
                }
                else if (strengthNum > 8) {
                    System.out.println("You are strong");
                }
                else {
                    System.out.println("You are very strong");
                }
            }
            else if (input.equalsIgnoreCase("D")) {
                success = true;
                System.out.println("Switch Statement Program");
                System.out.println("Vending Machine");
                System.out.println("Menu: ");
                System.out.println("[C]offee    [S]oda");
                System.out.println("[M]ilk      [J]uice");
                System.out.print("Enter Desired Drink: ");
                String drink = scanner.nextLine();
                switch(drink) {
                    case "C":
                    case "c":
                        System.out.println("Cluck Cluck Cluck ... Coffee Popped up");
                        break;
                    case "S":
                    case "s":
                        System.out.println("Cluck Cluck Cluck ... Soda Popped up");
                        break;
                    case "M":
                    case "m":
                        System.out.println("Cluck Cluck Cluck ... Milk Popped up");
                        break;
                    case "J":
                    case "j":
                        System.out.println("Cluck Cluck Cluck ... Juice Popped up");
                        break;
                    default:
                        System.out.println("No such item try again");
                }
            }
            else if (input.equalsIgnoreCase("E")) {
                success = true;
                System.out.println("While Loop Program");
                System.out.println("Fibonacci Series up to 20th term");
                int count = 20;
                int firstNum = 0;
                int secondNum = 1;
                int i = 0;
                while(i < count)
                {
                    System.out.print(firstNum+" ");
                    int nextNum = firstNum + secondNum;
                    firstNum= secondNum;
                    secondNum = nextNum;
                    i++;
                }
            }
            else if (input.equalsIgnoreCase("F")) {
                success = true;
                System.out.println("Do While Loop Program");
                System.out.println("Count Backwards 10-1");
                int num = 10;
                do {
                    System.out.println("Number: " + num);
                    num--;
                }
                while(num > 0);
            }
            else if (input.equalsIgnoreCase("G")) {
                success = true;
                System.out.println("For Loop Program");
                System.out.println("Pyramid");
                System.out.print("Enter Pyramid Height 2-20: ");
                int pyramidHeight = scanner.nextInt();
                // validate pyramid height
                if (pyramidHeight > 20 || pyramidHeight < 2) {
                    System.out.println("Please try again");
                }
                // outer loop
                else {
                    for (int i = 0; i < pyramidHeight; i++) {
                        // print spaces
                        for (int j = 0; j < pyramidHeight - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("# ");
                        }
                        System.out.println();
                    }
                }
            }
            else {
                System.out.println("Input Out of Range Please Try Again.");
            }
        }
        while (!success);
    }
}
