package org.example.AlgoProgramme;

public class Staircase {

    public static int countWays(int n) {

        // Base cases
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive relation
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {

        int n = 5;

        int result = countWays(n);

        System.out.println("Total ways = " + result);
    }
}
