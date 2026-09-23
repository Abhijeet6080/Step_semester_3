package arrays.assignment_problems;
import java.util.Arrays;

public class MergeSortedArrays {
    public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) result[k++] = arr1[i++];
        while (j < arr2.length) result[k++] = arr2[j++];
        
        return result;
    }

    public static void main(String[] args) {
        MergeSortedArrays solution = new MergeSortedArrays();
        
        // Sample Input 1
        int[] result1 = solution.mergeSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6});
        System.out.println("Test 1: " + Arrays.toString(result1));

        // Sample Input 2
        int[] result2 = solution.mergeSortedArrays(new int[]{}, new int[]{1, 2, 3});
        System.out.println("Test 2: " + Arrays.toString(result2));
    }
}