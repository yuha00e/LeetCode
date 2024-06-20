class Solution {

    public int findNonMinOrMax(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return -1;
        }

        Arrays.sort(nums);
        return nums[1];
    }

}