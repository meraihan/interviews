package com.own.geeks;

import java.util.Scanner;

/**
 * @author raihan on 1/19/2020
 */
public class PalindromeArray {

    static boolean isPalindrome(int N)
    {
        String str = "" + N;
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i))
                return false;
        }
        return true;
    }

    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            boolean ans = isPalindrome(a[i]);
            if (ans == false)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            System.out.println(palinArray(a, n));
        }
    }
}
