package com.own.sort;

/**
 * @author raihan on 1/15/2020
 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the
 * picked pivot. There are many different versions of quickSort that pick pivot in different ways.

 * Always pick first element as pivot.
 * Always pick last element as pivot (implemented below)
 * Pick a random element as pivot.
 * Pick median as pivot.

 * The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, put x at its
 * correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x)
 * after x. All this should be done in linear time.

 * Time complexity of Quick sort(Best and average cases): O(n logn), Worst Case: O(n*n)
 */
public class QuickSort {

    int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low - 1);
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(int arr[], int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 3, 7, 6, 4};
        int n = arr.length;
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0, n-1);

        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
