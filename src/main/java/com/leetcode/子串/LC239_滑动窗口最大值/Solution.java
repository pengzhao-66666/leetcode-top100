package com.leetcode.子串.LC239_滑动窗口最大值;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: zp
 * @Date: 2026/10/8 21:15
 * @Description: 滑动窗口最大值
 * @Solution: 单调队列
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length < 2) return nums;
        // 创建结果数组，存储每个滑动窗口的最大值
        int[] ans = new int[nums.length - k + 1];
        // 使用双端队列来维护一个单调队列，队列中存储的是数组索引
        Deque<Integer> deque = new LinkedList<>();
        // 初始化第一个窗口
        for(int i = 0; i < k; i++) {
            // 维护队列的单调性，如果当前元素大于等于队尾元素，则移除队尾元素
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();
            }
            // 将当前元素的索引加入队尾
            deque.offerLast(i);
            // 第一个窗口的最大值就是队首元素对应的值
            ans[0] = nums[deque.peekFirst()];
        }
        // 处理后续窗口
        for(int i = k; i < nums.length; i++){
            // 维护队列的单调性，如果当前元素大于等于队尾元素，则移除队尾元素
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();
            }
            // 将当前元素的索引加入队尾
            deque.offerLast(i);
            // 移除超出窗口范围的队首元素
            while(deque.peekFirst() < i-k+1){
                deque.pollFirst();
            }
            // 将当前窗口的最大值存入结果数组
            ans[i-k+1] = nums[deque.peekFirst()];
        }
        // 返回结果数组
        return ans;
    }
}
