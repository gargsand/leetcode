class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i ++) {
            int lookingFor = target - nums[i];
            answer[0] = i;
            for (int j = i +1; j < nums.length; j++) {
                if (nums[j] == lookingFor) {
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }
}

