package org.perscholas.src.jd.pa.scanner;

// https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
// Java Stdin and Stdout I

import java.util.Scanner;

public class ScannerPartOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}