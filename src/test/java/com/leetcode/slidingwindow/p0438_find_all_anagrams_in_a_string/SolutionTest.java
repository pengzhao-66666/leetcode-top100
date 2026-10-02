package com.leetcode.slidingwindow.p0438_find_all_anagrams_in_a_string;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTest {
    @Test
    void testTwoSum() {
        Solution s = new Solution();
//        List<Integer> res = s.findAnagrams("cbaebabacd", "abc");
        List<Integer> res = s.findAnagrams("abab", "ab");
        System.out.println(res);
    }
}
