/*
   1
   1 2
   1 2 3
   1 2 3 4
*/

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        printPattern3(n);
    }
    private static void printPattern3(int n) {
        for (int i = 0; i < n; i++) {
            int k = 1;
            for (int j = 0; j < (i+1); j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
