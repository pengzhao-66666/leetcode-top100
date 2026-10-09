package com.leetcode.子串.LC560_和为k的子数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zp
 * @Date: 2026/10/8 20:30
 * @Description: 和等于K的子数组
 * @Solution: 前缀和 + 哈希表优化
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        // 前缀和
        int preSum = 0;
        // 记录和为k的子数组个数
        int count = 0;
        // key: 前缀和, value: 出现次数
        Map<Integer, Integer> map = new HashMap<>();
        // 初始化前缀和为0的次数为1
        map.put(0, 1);
        // 遍历数组
        for(int i = 0; i < nums.length; i++) {
            // 计算当前前缀和
            preSum += nums[i];
            // 如果存在前缀和为preSum - k的子数组，则说明存在和为k的子数组
            if(map.containsKey(preSum - k)){
                count += map.get(preSum - k);
            }
            // 更新前缀和为preSum的次数
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
