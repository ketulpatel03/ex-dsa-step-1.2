package com.java;

public class Patterns {

    private static void print1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    private static void print2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    private static void print3(int n) {
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    private static void print4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    private static void print5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    private static void print6(int n) {
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(count++ + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print1(5);
        print2(5);
        print3(5);
        print4(5);
        print5(5);
        print6(5);
    }


}
