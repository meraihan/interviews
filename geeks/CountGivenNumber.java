package com.own.geeks;

import java.util.*;

/**
 * @author raihan on 1/16/2020
 * Given an array A[]  of n elements. Your task is to complete the Function num which returns an integer denoting the total number of
 * times digit k appears in the whole array. For Example:
 * A[]={11,12,13,14,15}, k=1
 * Output=6 //Count of the digit 1 in the array
 */
public class CountGivenNumber {
    public static int num(int a[], int n, int k)
    {
        int digits = 0;
        for (int i = 0; i < n; i++) {
            int div = a[i];
            while (div >= 10) {
                int mod = div % 10;
                if (mod == k) {
                    digits++;
                }
                div = div / 10;
            }
            if (div == k) {
                digits++;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-->0){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
            }
            int k = in.nextInt();
            CountGivenNumber cn = new CountGivenNumber();
            System.out.println(cn.num(a, n, k));
        }
    }
}
