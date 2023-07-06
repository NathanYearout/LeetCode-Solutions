class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> checkedNums = new HashSet<Integer>();

        // Check if checkedNums map has current number, if not add it.
        for (int i = 0; i < nums.length; i++) {
            if (checkedNums.contains(nums[i])) {
                return true;
            }
            checkedNums.add(nums[i]);
        }
        return false;
    }
}