import java.util.Scanner;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean isSwap = false;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
