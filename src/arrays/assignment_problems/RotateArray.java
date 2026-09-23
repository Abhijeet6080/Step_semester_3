package arrays.assignment_problems;
import java.util.Arrays;

public class RotateArray {
    public int[] rotateArray(int[] nums, int k) {
        if (nums.length == 0) return nums;
        k = k % nums.length;
        int[] result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
        
        // Sample Input 1
        int[] result1 = solution.rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        System.out.println("Test 1: " + Arrays.toString(result1));

        // Sample Input 2
        int[] result2 = solution.rotateArray(new int[]{1, 2}, 3);
        System.out.println("Test 2: " + Arrays.toString(result2));
    }
}