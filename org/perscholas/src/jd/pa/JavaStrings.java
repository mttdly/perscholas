package org.perscholas.src.jd.pa;

import java.util.Scanner;

public class JavaStrings {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        //StringsIntroduction(); // HR submission: https://www.hackerrank.com/challenges/java-strings-introduction/submissions/code/304204540
        //Substring(); // HR submission: https://www.hackerrank.com/challenges/java-substring/submissions/code/303171268
        //SubstringComparisons(); // HR submission: https://www.hackerrank.com/challenges/java-string-compare/submissions/code/304280449
        //StringReverse(); // HR submission: https://www.hackerrank.com/challenges/java-string-reverse/submissions/code/304204016
        //StringTokens(); // HR submission: https://www.hackerrank.com/challenges/java-string-tokens/submissions/code/304286759
    }

    public static void StringsIntroduction() {
        /*
            Java Strings Introduction - HackerRank (Submitted)
            https://www.hackerrank.com/challenges/java-strings-introduction/problem
        */

        String A = userInput.next();
        String B = userInput.next();
        userInput.close();

        // Sum of both String lengths
        System.out.println(A.length() + B.length());

        // Comparison if A is larger than B using ternary operator
        String comparisonResult = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(comparisonResult);

        // Print input with each String having a capital letter
        String capitalA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalA + " " + capitalB);
    }

    public static void Substring() {
        Scanner userInput = new Scanner(System.in);
        String S = userInput.next();
        int start = userInput.nextInt();
        int end = userInput.nextInt();
        userInput.close();

        System.out.println(S.substring(start, end));
    }

    public static String SubstringComparisons(String s, int k) {
        s = userInput.next();
        k = userInput.nextInt();
        userInput.close();
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {

            String strHolder = s.substring(i, k + i);

            if (smallest.compareTo(strHolder) > 0) {
                smallest = strHolder;
            }

            if (largest.compareTo(strHolder) < 0) {
                largest = strHolder;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void StringReverse() {
        String reversedString = "";

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        // Set it lowercase for edge cases
        A.toLowerCase();
        reversedString.toLowerCase();

        // Iterate through letters of the String and reverse, store in reversedString
        for (int i = A.length() - 1; i >= 0; i--) {
            reversedString += A.charAt(i);
        }

        if (reversedString.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void StringTokens() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim(); // eliminate leading/trailing spaces


        int tokenAmount = 0;

        String[] tokenList = s.split("[^a-zA-Z]");

        for (int i = 0; i < tokenList.length; i++)
            if (tokenList[i].length() > 0)
                tokenAmount++;

        System.out.println(tokenAmount);

        for (int i = 0; i < tokenList.length; i++) {
            if (tokenList[i].length() > 0) {
                System.out.println(tokenList[i]);
            }
        }
        scan.close();
    }
}





