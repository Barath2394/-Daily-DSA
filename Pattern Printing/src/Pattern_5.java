/*
  * * * *
  * * *
  * *
  *
*/


import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        printPattern5(n);
    }

    private static void printPattern5(int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
