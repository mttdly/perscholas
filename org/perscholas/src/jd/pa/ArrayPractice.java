// JD Module 303.3.2 - Practice Assignment - Array

package org.perscholas.src.jd.pa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
//        practiceOne();
//        practiceTwo();
//        practiceThree();
//        practiceFour();
//        practiceFive();
//        practiceSix();
//        practiceSeven();
//        practiceEight();
//        practiceNine();
//        practiceTen();
//        practiceEleven();
    }

    public static void practiceOne() {
        /*
            Write a program that creates an array of integers with a length of 3.
            Assign the values 1, 2, and 3 to the indexes.
            Print out each array element.
         */

        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void practiceTwo() {
        /*
         * Write a program that returns the middle element in an array.
         * Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
         */

        int[] intArray = {13, 5, 7, 68, 2};
        int middleOfArray = intArray[(intArray.length - 1) / 2];   // (5 - 1) = (4 / 2) = 2
        System.out.println(middleOfArray);
    }

    public static void practiceThree() {
        /*
            Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”.
            Print out the array length. Make a copy using the clone( ) method.
            Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
         */

        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println(colors.length); // 4
        String[] copyColors = colors.clone(); // Deep copy, as 1D copies values. 2d+ only references (Shallow Copy)

        if (Arrays.toString(copyColors).equals(Arrays.toString(colors))) {
            System.out.print("[SUCCESS] Original array copied to new array and matches.");
        } else {
            System.out.print("[FAILED] Original array does not match the new array.");
        }
    }

    public static void practiceFour() {
        /*
            Write a program that creates an integer array with 5 elements (i.e., numbers).
            The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index.
            Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).
            Notice the type of exception which is produced. Now try to assign a value to the array index 5.
            You should get the same type of exception.
         */

        int[] intArray = new int[] {4, 3, 6, 2, 5};
        System.out.print(intArray[0] + "\n");                   // First index (Index 0 = value 4)
        System.out.print(intArray[intArray.length - 1] + "\n"); // Last index value (Index = 4, value = 5)


        System.out.println(intArray[intArray.length]);          // Produces out of bounds exception
        intArray[5] = 2;                                        // Produces out of bounds exception

    }

    public static void practiceFive() {
        /*
            Write a program where you create an integer array with a length of 5.
            Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
         */

        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
            // System.out.println(intArray[i]);     // Tester
        }

    }

    public static void practiceSix() {
        /*
            Write a program where you create an integer array of 5 numbers.
            Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
         */

        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
            // System.out.println(intArray[i]);     // Tester
        }
    }

    public static void practiceSeven() {
        /*
            Write a program where you create an array of 5 elements.
            Loop through the array and print the value of each element, except for the middle (index 2) element.
         */

        int[] intArray = new int[] {93, 27, 57, 18, 84};

        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length / 2) {
                continue;
            }
            System.out.println(intArray[i]);
        }
    }

    public static void practiceEight() {
        /*
            Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
         */

        String[] strArray = new String[] {"Element1", "Element2", "Element3", "Element4", "Element5"};

        String temp = strArray[0];
        strArray[0] = strArray[2];
        strArray[2] = temp;

        for (String s : strArray) {
            System.out.println(s);
        }
    }

    public static void practiceNine() {
        /*
            Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
            Print the array in ascending order, and print the smallest and the largest element of the array.
            The output will look like the following:
           	    Array in ascending order: 0, 1, 2, 4, 9, 13
         		The smallest number is 0
         		The biggest number is 13
         */


        int[] intArray = new int[] {4, 2, 9, 13, 1, 0};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        int smallestNumber = intArray[0];
        int biggestNumber = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > biggestNumber) {
                biggestNumber = intArray[i];
            } else if (intArray[i] < smallestNumber)
                smallestNumber = intArray[i];
        }

        System.out.println("The smallest number is " + smallestNumber);
        System.out.println("The biggest number is " + biggestNumber);

    }

    public static void practiceTen() {
        /*
            Create an array that includes an integer, 3 strings, and 1 double.
            Print the array.
         */

        // Object lets you hold multiple different data types.
        Object[] intArray = new Object[] {3, "String One", "String Two", "String Three", 2.0D};
        System.out.println(Arrays.toString(intArray));
//        for (int i = 0 ; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }
    }

    public static void practiceEleven() {
        /*
            Write some Java code that asks the user how many favorite things they have.
            Based on their answer, you should create a String array of the correct size.
            Then ask the user to enter the things and store them in the array you created.
            Finally, print out the contents of the array.

          		Example:
          				How many favorite things do you have? 7
         				Enter your thing: phone
         				Enter your thing: tv
         				Enter your thing: xbox
         				Enter your thing: wine
         				Enter your thing: beer
         				Enter your thing: sofa
         				Enter your thing: book
         				Your favorite  things are: phone tv xbox wine beer sofa book
         */

        Scanner userInput = new Scanner(System.in);
        System.out.print("How many favorite things do you have? ");
        int answer = userInput.nextInt();

        String[] strArray = new String[answer];

        for (int i = 0; i < answer; i++) {
            System.out.print("Enter your thing: ");
            strArray[i] = userInput.next();
        }

        System.out.println("Your favorite things are: " + Arrays.toString(strArray));
    }
}
