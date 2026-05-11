/*
  1 2 3 4 5
  1 2 3 4
  1 2 3
  1 2
  1
 */


import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        printPattern6(n);
    }

    private static void printPattern6(int n) {
        for (int i = 0; i < n ; i++) {
            int k = 1;
            for (int j = 0; j < (n - i); j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
