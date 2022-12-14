// JD Module 303.3 - Practice Assignment - Loops

package org.perscholas.src.jd.pa;

import java.util.Scanner;

public class Loops {

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

        int sizeOfTable = 12;

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

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the first positive integer: ");
        int n1 = userInput.nextInt();
        System.out.print("Enter the second positive integer: ");
        int n2 = userInput.nextInt();

        int gcd = 1;
        for (int k = 2; k <= n1 || k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }
        System.out.println("GCD is: " + gcd);
        userInput.close();
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

        double currentTuition = 10000;
        double rateIncrease = 0.07;
        double doubledTuition = currentTuition * 2;
        int year = 0;

        while (currentTuition < doubledTuition) {
            currentTuition *= (1 + rateIncrease);
            year++;
        }
        System.out.printf("%nIt will take %d years to double your current tuition.", year);
    }
}
