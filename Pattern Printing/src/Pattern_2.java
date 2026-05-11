/*
   *
   * *
   * * *
*/

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        printPattern2(n);
    }

    private static void printPattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (i+1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
