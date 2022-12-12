package org.perscholas.src.jd.pa;

public class OperatorsAndNumbers {
    public static void main(String[] args) {
        //questionOne();   // #1
        //questionTwo();   // #2
        //questionThree();     // #3
        //questionFour();      // #4
        //questionFive();      // #5
        //questionSix();       // #6
        //questionSeven();     // #7
        //questionEight();     // #8
    }

    // #1
    static void questionOne() {
        /*
            Write the following integers in binary notation.
            Do not use any Java functions or online conversion applications to calculate the answer.
            However, you may check your answers using Java methods.

                1	-	1
                8	-	1000
                33	- 100001
                78	-	1001110
                787	-	1100010011
                33,987	- 1000010011000011
        */

        long[] nums = new long[] {1L, 8L, 33L, 78L, 787L, 33987L};

        for (int x = 0; x < nums.length; x++) {
            String binary = "";                         // Set the binary to blank for the start of next int
            while (nums[x] > 0) {
                int rightBit = (int) (nums[x] & 1);

                binary = rightBit + binary;

                nums[x] = nums[x] >> 1;
            }
            System.out.println(binary);
        }

    }

    // #2
    static void questionTwo() {
        /*
            Convert the following binary numbers to decimal notation.
            Do not use any Java functions or online conversion applications to calculate the answer
            as this will hinder the learning process and your understanding of the concept.
            However, you may check your answers using Java methods.

            0010
            1001
            0011 0100
            0111 0010
            0010 0001 1111
            0010 1100 0110 0111
        */

        long[] binNum = new long[6];
        binNum[0] = 10L;
        binNum[1] = 1001L;
        binNum[2] = 110100L;
        binNum[3] = 1110010L;
        binNum[4] = 1000011111L;
        binNum[5] = 10110001100111L;

        for (int i = binNum.length - 1; i >= 0; i--) {
            long currentBinary = binNum[i];

            int decimalNum = 0;
            int power = 0;
            int remainder = 0;

            while (currentBinary > 0) {
                remainder = (int) (currentBinary % 10);
                decimalNum += remainder * Math.pow(2, power);
                power++;
                currentBinary /= 10;
            }

            System.out.println(decimalNum);
        }
    }

    // #3
    static void questionThree() {
        /*
            Write a program that declares an integer a variable x and assigns the value 2 to it
            and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
            Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
            Before printing the results, write a comment with the predicted decimal value and binary string.
            Now, print out x in decimal form and in binary notation.
            Do the preceding exercise with the following values:
            9
            17
            88
        */

        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        System.out.println(x);

    }

    // #4
    static void questionFour() {
        /*
            Write a program that declares a variable x and assigns 150 to it, and prints out the binary string version of the number.
            Now use the right shift operator (>>) to shift by 2 and assign the result to x.
            Write a comment indicating what you anticipate the decimal and binary values to be. Now print the value of x and the binary string.
            Do the preceding exercise with the following values:
            225
            1555
            32456
         */

        int[] nums = {150, 225, 1555, 32456};

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            //System.out.println
            System.out.printf("Input integer:            %d%n", x);
            System.out.printf("Integer to binary string: %s%n", Integer.toBinaryString(x));

            x = x >> 2;
            // PREDICTION: It'll be 2 numbers deleted off the end of the binary string
            System.out.printf("Binary string << 2:       %s%n%n", Integer.toBinaryString(x));
        }
    }

    // #5
    static void questionFive() {
        /*
            Write a program that declares three int variables x, y, and z.
            Assign 7 to x and 17 to y.
            Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y.
            Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
            Now, with the preceding values, use the bitwise | operator to calculate the 'or' value between x and y.
            As before, write a comment that indicates what you predict the values to be before printing them out.
         */

        int x = 7; // BINARY: 00000111
        int y = 17; // BINARY: 00010001
        // PREDICTION: Result of the bitwise & operation on x and y will be 1.

        int z = (x & y); // BINARY: 00000001 (1 as decimal)
        System.out.printf("%d%n", z);

        z = x | y;
        // PREDICTION: Result will be 23
        System.out.printf("%d", z);


    }

    // #6
    static void questionSix() {
        /*
            Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value.
            Print the value before and after the increment operator.
        */

        int x = 5;
        System.out.printf("Value before: %d%n", x);
        x++;
        System.out.printf("Value after: %d", x);
    }

    // #7
    static void questionSeven() {
        /*
            Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times.
            Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.
         */

        int numToInc;

        numToInc = 2;
        System.out.printf("%nInitial integer is %d for all methods.%n%n", numToInc);
        System.out.printf("Method 1 (Post): %d++%n", numToInc);
        for (int i = 0; i < 2; i++) {
            ++ numToInc;
            System.out.println(numToInc);
        }

        numToInc = 2;
        System.out.printf("Method 2 (Pre): ++%d%n", numToInc);
        for (int i = 0; i < 2; i++) {
            ++ numToInc;
            System.out.println(numToInc);
        }

        numToInc = 2;
        System.out.printf("Method 3: %d = %d + 1%n", numToInc, numToInc);
        for (int i = 0; i < 2; i++) {
            numToInc += 1;
            System.out.println(numToInc);
        }
    }

    // #8
    static void questionEight() {
        /*
            Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y.
            Create another variable sum and assign the value of ++x added to y, and print the result.
            Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program.
            Notice what the value of the sum is.
            The first configuration incremented x and then calculated the sum, while the second configuration calculated the sum and then incremented x.
         */

        int x = 5;
        int y = 8;

        // Increment x and then calculate sum
        int sum = y + (++ x);
        System.out.println(sum);

        // Calculates sum and then increments x
        int sum2 = y + (x++);
        System.out.println(sum2);
    }
}
