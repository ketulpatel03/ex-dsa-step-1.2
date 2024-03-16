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

    private static void print7(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void print8(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void print9(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void print10(int n) {
        for (int i = 1; i <= (2 * n - 1); i++) {
            int stars = i;
            if (i > n) {
                for (int j = 1; j <= (2 * n - i); j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void print11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    private static void print12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // number
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // number
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
            space -= 2;
        }
    }

    private static void print13(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }

    private static void print14(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    private static void print15(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch < 'A' + (n - i); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    private static void print16(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }

    private static void print17(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            // characters
            char ch = 'A';
            int breakPoint = (2 * i + 1) / 2;
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print(ch);
                if (j <= breakPoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            // space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print1(5);
        print2(5);
        print3(5);
        print4(5);
        print5(5);
        print6(5);
        print7(5);
        print8(5);
        print9(5);
        print10(5);
        print11(5);
        print12(4);
        print13(5);
        print14(5);
        print15(5);
        print16(5);
        print17(5);
    }


}
