package com.own.sort;

/**
 * @author raihan on 12/26/2019
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 *  Complexity of the bubble sort algorithm is,
 *  Worst Case/Average Case: O(n*n). Worst Case occurs when array is reverse sorted
 *  Best Case: O(n). It occurs when array is already sorted.
 */

public class BubbleSort {
    
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String args[]) {
//      BubbleSort b = new BubbleSort();
      int arr[] = {5,6,1,2,7,3,4};
      bubbleSort(arr);
      System.out.println("Sorted Array: ");
      printArray(arr);
    }
}
