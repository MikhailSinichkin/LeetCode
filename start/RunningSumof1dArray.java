// Given an array nums. 
// We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Для данного массива nums. 
// Мы определяем текущую сумму массива как 
// runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.
// Example 1:
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
// Example 2:
// Input: nums = [1,1,1,1,1]
// Output: [1,2,3,4,5]
// Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
// Example 3:
// Input: nums = [3,1,2,10,1]
// Output: [3,4,6,16,17]

import java.util.Arrays;

class RunningSumof1dArray {
    static class Solution {
        public int[] runningSum(int[] nums) {
            for (int i = 1 ; i < nums.length; i++){
                nums[i] += nums[i-1];
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}