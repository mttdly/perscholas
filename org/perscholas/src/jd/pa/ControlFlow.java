// JD Module 303.2 - Practice Assignment - Control Flow (Conditional) Statements
package org.perscholas.src.jd.pa;

import java.util.Scanner;

public class ControlFlow {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
//        questionOne(); // #1
//        questionTwo(); // #2
//        questionThree(); // #3
//        questionFour(); // #4
//        questionFive(); // #5
//        questionSix(); // #6
//        questionSeven(); // #7
    }

    public static void questionOne() {
        /*
        Write a program that declares 1 integer variable x, and then assigns 7 to it.
        Write an if statement to print out “Less than 10” if x is less than 10.
        Change x to equal 15, and notice the result (console should not display anything).
        */

        int x = 7;

        // Prints out text
        if(x < 10) {
            System.out.println("Less than 10");
        }

        // Doesn't print out text
        x = 15;
        if(x < 10) {
            System.out.println("Less than 10");
        }
    }

    public static void questionTwo() {
        /*
            Write a program that declares 1 integer variable x, and then assigns 7 to it.
            Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10.
            Change x to 15 and notice the result.
        */

        int x = 7;

        if(x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }

        x = 15;

        if(x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }

    public static void questionThree() {
        /*
            Write a program that declares 1 integer variable x, and then assigns 15 to it.
            Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
            “Between 10 and 20” if x is greater than 10 but less than 20,
            and “Greater than or equal to 20” if x is greater than or equal to 20.
            Change x to 50 and notice the result.
        */

        int x = 50;

        if (x < 10) {
            System.out.println("Less than 10");
        } else if(x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else if (x >= 20) {
            System.out.println("Greater than or equal to 20");
        }
    }

    public static void questionFour() {
        /*
            Write a program that declares 1 integer variable x, and then assigns 15 to it.
            Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20
            and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20).
            Change x to 5 and notice the result.
         */

        int x = 15;
        // int x = 5;

        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }



    }

    public static void questionFive() {
        /*
            Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
                A: 90-100
                B: 80-89
                C: 70-79
                D: 60-69
                F: <60
            Use the Scanner class to accept a number score from the user to determine the letter grade.
            Print out “Score out of range” if the score is less than 0 or greater than 100.
         */

        int grade = userInput.nextInt();
        if (grade <= 100 && grade >= 90) {
            System.out.println("A");
        } else if (grade <= 89 && grade >= 80) {
            System.out.println("B");
        } else if (grade <= 79 && grade >= 70) {
            System.out.println("C");
        } else if (grade <= 69 && grade >= 60) {
            System.out.println("D");
        } else if (grade < 60) {
            System.out.println("F");
        } else if (grade < 0 || grade > 100) {
            System.out.println("Score out of range");
        }
    }

    public static void questionSix() {
        /*
                Write a program that accepts an integer between 1 and 7 from the user.
                Use a switch statement to print out the corresponding weekday.
                Print “Out of range” if the number is less than 1 or greater than 7.
                Do not forget to include “break” statements in each of your cases.
         */

        int intInput = userInput.nextInt();
        if (intInput < 1 || intInput > 7) {
            System.out.println("Out of range");
        }
        else {
            switch (intInput) {
                case 1 -> System.out.println("Sunday");
                case 2 -> System.out.println("Monday");
                case 3 -> System.out.println("Tuesday");
                case 4 -> System.out.println("Wednesday");
                case 5 -> System.out.println("Thursday");
                case 6 -> System.out.println("Friday");
                case 7 -> System.out.println("Saturday");
                default -> System.out.println("Out of range");
            }
        }
    }

    public static void questionSeven() {
        /*
            Create a program that lets the users input their filing status and income. Display how much tax the user would have to pay according to status and income.
            The U.S. federal personal income tax is calculated based on the filing status and taxable income.
            There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
            The tax rates for 2009 are shown below.
         */

        System.out.println("What is your filing status?");
        System.out.println("(single, joint, separate, head)");
        String filingStatus = userInput.nextLine().toLowerCase().trim();
        System.out.printf("%nWhat is your yearly income?%n");
        System.out.println("Only use numbers, no commas. Ex. 38,398 should be 38398");
        int income = userInput.nextInt();

        if ("single".equals(filingStatus)) {
            if (income >= 0 && income <= 8350) {
                System.out.println("Tax Rate is 10%");
            } else if (income >= 8351 && income <= 33950) {
                System.out.println("Tax Rate is 15%");
            } else if (income >= 33951 && income <= 82250) {
                System.out.println("Tax Rate is 25%");
            } else if (income >= 82251 && income <= 171550) {
                System.out.println("Tax Rate is 28%");
            } else if (income >= 171551 && income <= 372950) {
                System.out.println("Tax Rate is 33%");
            } else if (income >= 372951) {
                System.out.println("Tax Rate is 35%");
            }
        }

        if ("joint".equals(filingStatus)) {
            if (income >= 0 && income <= 8350) {
                System.out.println("Tax Rate is 10%");
            } else if (income >= 8351 && income <= 33950) {
                System.out.println("Tax Rate is 15%");
            } else if (income >= 33951 && income <= 82250) {
                System.out.println("Tax Rate is 25%");
            } else if (income >= 82251 && income <= 171550) {
                System.out.println("Tax Rate is 28%");
            } else if (income >= 171551 && income <= 372950) {
                System.out.println("Tax Rate is 33%");
            } else if (income >= 372951) {
                System.out.println("Tax Rate is 35%");
            }
        }

        if ("separate".equals(filingStatus)) {
            if (income >= 0 && income <= 8350) {
                System.out.println("Tax Rate is 10%");
            } else if (income >= 8351 && income <= 33950) {
                System.out.println("Tax Rate is 15%");
            } else if (income >= 33951 && income <= 82250) {
                System.out.println("Tax Rate is 25%");
            } else if (income >= 82251 && income <= 171550) {
                System.out.println("Tax Rate is 28%");
            } else if (income >= 171551 && income <= 372950) {
                System.out.println("Tax Rate is 33%");
            } else if (income >= 372951) {
                System.out.println("Tax Rate is 35%");
            }
        }

        if ("head".equals(filingStatus)) {
            if (income >= 0 && income <= 8350) {
                System.out.println("Tax Rate is 10%");
            } else if (income >= 8351 && income <= 33950) {
                System.out.println("Tax Rate is 15%");
            } else if (income >= 33951 && income <= 82250) {
                System.out.println("Tax Rate is 25%");
            } else if (income >= 82251 && income <= 171550) {
                System.out.println("Tax Rate is 28%");
            } else if (income >= 171551 && income <= 372950) {
                System.out.println("Tax Rate is 33%");
            } else if (income >= 372951) {
                System.out.println("Tax Rate is 35%");
            }
        }
    }
}
