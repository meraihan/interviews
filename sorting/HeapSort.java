package com.own.sort;

/**
 * @author raihan on 1/05/2020
 * Heap sort is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first
 * find the maximum element and place the maximum element at the end. We repeat the same process for remaining element.

 * Since a Binary Heap is a Complete Binary Tree, it can be easily represented as array and array based representation is space efficient.
 * If the parent node is stored at index I, the left child can be calculated by 2 * I + 1 and right child by 2 * I + 2 (assuming the
 * indexing starts at 0).

 * Heap Sort Algorithm for sorting in increasing order:
 * 1. Build a max heap from the input data.
 * 2. At this point, the largest item is stored at the root of the heap. Replace it with the last item of the heap followed by reducing
 * the size of heap by 1. Finally, heapify the root of tree.
 * 3. Repeat above steps while size of heap is greater than 1.

 * Time complexity of heap sort: O(n logn) for all cases.
 */

public class HeapSort {
    
    public void sort(int arr[]){
        int n = arr.length;
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapify(arr, i, 0);
        }
    }
    
    void heapify(int arr[], int n, int loopValue){
          int largest = loopValue;
          int left = 2 * loopValue + 1;
          int right = 2 * loopValue + 2;
          
          if(right<n && arr[right]>arr[largest]){
              largest = right;
          }
          if(largest != loopValue){
              int swap = arr[loopValue];
              arr[loopValue] = arr[largest];
              arr[largest] = swap;
              
              heapify(arr, n, largest);
          }
      }
      
      static void printArray(int arr[]){
          int n = arr.length;
          for(int i=0;i<n;i++){
              System.out.print(arr[i]+ " ");
          }
          System.out.println();
      }
    
    public static void main(String args[]) {
        int arr[] = {12,11,13,5,6,7};
        int n = arr.length;
        HeapSort hp = new HeapSort();
        hp.sort(arr);
        
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}