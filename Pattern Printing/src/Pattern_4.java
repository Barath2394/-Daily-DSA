/*
   1
   2 2
   3 3 3
   4 4 4 4
*/

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        printPattern4(n);
    }
    private static void printPattern4(int n) {
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (i+1); j++) {
                System.out.print(k + " ");
            }
            k += 1;
            System.out.println();
        }
    }
}