import java.util.Scanner;

public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter values :");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Maximum Subarray Sum = " + maximumSubArraySum(arr));
    }
    private static int maximumSubArraySum(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int sum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (sum >= 0) {
                sum += arr[i];
            } else {
                sum = arr[i];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
