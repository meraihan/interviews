package com.own.sort;

/**
 * @author raihan on 12/28/2019
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted
 * part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

 * 1) The subarray which is already sorted.
 * 2) Remaining subarray which is unsorted.

 * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and
 * moved to the sorted subarray
 * Time Complexity of Selection sort: O(n*n) in all case
 */

public class SelectionSort {
    
    void sort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1; j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    
    public static void main(String args[]) {
      SelectionSort st = new SelectionSort();
      int arr[] = {65,25,12,22,11};
      st.sort(arr);
      System.out.println("Sorted Array: ");
      st.printArray(arr);
    }
}