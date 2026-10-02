package com.leetcode.slidingwindow.p0438_find_all_anagrams_in_a_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        String std = new String(arr);
        System.out.println("std:" + std);

        int n = p.length();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i < s.length() - n+1; i++){

            String str1 = s.substring(i,i+n);
            char[] arr2 = str1.toCharArray();
            Arrays.sort(arr2);
            String str2 = new String(arr2);
            System.out.println("str2:" + str2);
            if(str2.equals(std)){
                result.add(i);
            }
        }
        return result;
    }
}
