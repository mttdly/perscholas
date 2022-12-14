package org.perscholas.src.jd.pa.hackerrank;

import java.util.Scanner;

public class StdinAndStdout {
    public static void main(String[] args) {
        questionOne();
        questionTwo();
    }

    public static void questionOne() {
        /*
            https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
            Java Stdin and Stdout I
         */

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void questionTwo() {
        /*
            https://www.hackerrank.com/challenges/java-stdin-stdout/problem
            Java Stdin and Stdout I
         */

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}