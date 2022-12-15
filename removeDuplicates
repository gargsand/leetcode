// Remove Duplicates from Sorted Array
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
//
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[k++] = nums[i+1];
            }
        }
        return k;
    }
}
