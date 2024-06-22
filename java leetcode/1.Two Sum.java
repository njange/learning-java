//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//Example:

//Given nums = [2, 7, 11, 15], target = 9,

//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

//Solution 1: Brute Force

// Create hashmap
// Iterate through the array
//If map has target-nums[i] as key, return {i, map.get(target-nums[i])}
//Else, add nums[i] as key and i as value to map

import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }

            map.put(nums[i], i);

        }

        return new int[0];
    }
}