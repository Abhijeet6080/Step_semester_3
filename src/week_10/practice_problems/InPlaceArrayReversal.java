package week_10.practice_problems;
import java.util.Arrays;

public class InPlaceArrayReversal {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        reverseArray(new int[]{11, 22, 33, 44});
    }
}
