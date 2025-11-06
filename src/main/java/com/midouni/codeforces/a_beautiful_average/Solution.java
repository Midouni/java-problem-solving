// link -- https://codeforces.com/problemset/problem/2162/A
// package com.midouni.codeforces.a_beautiful_average;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }
            System.out.println(Collections.max(arr));
        }
    }
}
