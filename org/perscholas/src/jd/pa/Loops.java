// JD Module 303.3 - Practice Assignment - Loops

package org.perscholas.src.jd.pa;

import java.util.Scanner;

public class Loops {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        //questionOne();
        //questionTwo();
        //questionThree();
    }

    public static void questionOne() {
        /*
            Print a Multiplication Table
            Write a program that uses nested for loops to print a multiplication table.
        */

        // Since multiplication tables work off rows/columns, multidimensional arrays could be used

        System.out.print("Enter the desired size of the multiplication table: ");
        int sizeOfTable = userInput.nextInt();
        userInput.close();

        for(int r = 1; r <= sizeOfTable;  r++) {
            System.out.println("\n");
            for(int c = 1; c <= sizeOfTable; c++) {
                System.out.printf("%4d", r*c);
            }
        }

    }

    public static void questionTwo() {
        /*
            Question 2: Find the Greatest Common Divisor
            Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
            Examples:
            Enter 2 and 4. The gcd is 2.
            Enter 16 and 24.  The gcd is 8.
            How do you find the gcd?
            Name the two input integers n1 and n2.
            You know number 1 is a common divisor, but it may not be the gcd.
            Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
        */

        System.out.print("Enter the first positive integer: ");
        int n1 = userInput.nextInt();
        System.out.print("Enter the second positive integer: ");
        int n2 = userInput.nextInt();

        // Check if 1 is a common divisor for n1 and n2
        if (n1 % 1 == 0 && n2 % 1 == 0) {
            System.out.println("1 is a common divisor for " + n1 + " and " + n2);
        } else {
            System.out.println("1 is not a common divisor for " + n1 + " and " + n2);
        }

        // Numbers besides 1 to see if they are common divisor
        int gcd = 1;
        System.out.printf("Common divisors by %d and %d are: ", n1, n2);
        for (int k = 2; k <= n1 || k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
                if(gcd == 1) {
                    System.out.println("1");
                }else {
                    System.out.printf("%d %n", k);
                }
            }

        }

        // Print the result
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }

    public static void questionThree() {
        /*
            Question 3: Predict Future Tuition
            Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
            In how many years will the tuition be doubled?

            year | tuition
            0    | tuition = 1.07 * tuition
            1    | tuition = 1.07 * tuition
            ..   | 20,000 or more
        */

        System.out.print("How much is your current tuition per year? ");
        double currentTuition = userInput.nextInt();
        double startingTuition = currentTuition;
        double doubledTuition = currentTuition * 2;
        System.out.print("What's percentage rate of increase per year? ");
        int rateIncrease = userInput.nextInt();
        double rateDecIncrease = rateIncrease / 100.0;  // Rate as a decimal

        int year = 1;


        double increaseInTuition = (currentTuition * rateIncrease) * .01;

        while (currentTuition < doubledTuition) {
            currentTuition *= (1 + rateDecIncrease);
            System.out.printf("Tuition for year %d is %d.%n", year, (int)currentTuition);
            year++;
        }
        System.out.printf("%nIt will take %d years to double your current tuition of %d if the increase rate were %d%% per year.%n", year, (int) startingTuition, rateIncrease);
    }
}
