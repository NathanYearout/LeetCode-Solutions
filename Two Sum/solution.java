class Solution {
    public int[] twoSum(int[] nums, int target) {

        // For loop to check value against each-other in array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                return new int[] {i, j};
                }
            }
        }
        // Return nothing if no solution
        return null;
    }
}