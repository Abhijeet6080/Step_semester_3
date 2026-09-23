package arrays.assignment_problems;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        
        // Sample Input 1
        boolean result1 = solution.containsDuplicate(new int[]{1, 2, 3, 1});
        System.out.println("Test 1 contains duplicate: " + result1);

        // Sample Input 2
        boolean result2 = solution.containsDuplicate(new int[]{1, 2, 3, 4});
        System.out.println("Test 2 contains duplicate: " + result2);
    }
}