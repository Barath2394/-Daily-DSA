import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] result = getTwoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result[0] + " " + result[1]);
    }
    private static int[] getTwoSum(int[] arr, int target) {
        Map<Integer, Integer> mpp = new HashMap<>();
        // Traversing Through the Array
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (mpp.containsKey(diff)) {
                return new int[] {mpp.get(diff), i};
            } else {
                mpp.put(arr[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}

