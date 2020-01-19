package com.own.geeks;

import java.util.*;
import java.lang.*;
/**
 * @author raihan on 1/15/2020
 */
public class MissingElementOfAP {

    static int findMissingUtil(int arr[], int low,
                               int high, int diff)
    {
        // There must be two elements
        // to find the missing
        if (high <= low)
            return Integer.MAX_VALUE;

        // Find index of
        // middle element
        int mid = low + (high - low) / 2;

        // The element just after the
        // middle element is missing.
        // The arr[mid+1] must exist,
        // because we return when
        // (low == high) and take
        // floor of (high-low)/2
        if (arr[mid + 1] - arr[mid] != diff)
            return (arr[mid] + diff);

        // The element just
        // before mid is missing
        if (mid > 0 && arr[mid] -
                arr[mid - 1] != diff)
            return (arr[mid - 1] + diff);

        // If the elements till mid follow
        // AP, then recur for right half
        if (arr[mid] == arr[0] + mid * diff)
            return findMissingUtil(arr, mid + 1,
                    high, diff);

        // Else recur for left half
        return findMissingUtil(arr, low, mid - 1, diff);
    }

    static int findMissing(int arr[], int n)
    {
        int diff = (arr[n - 1] - arr[0]) / n;
        return findMissingUtil(arr, 0, n - 1, diff);
    }

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
            System.out.println(findMissing(arr,n));
        }
    }
}
