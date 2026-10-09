package com.leetcode.slidingwindow.p0438_find_all_anagrams_in_a_string;

import com.leetcode.子串.LC239_滑动窗口最大值.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    void test() {
        Solution s = new Solution();
        int[] res = s.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
        System.out.println(Arrays.toString(res));
    }
}
