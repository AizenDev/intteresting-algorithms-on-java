package com.company.sorts;

public class ISort {
    public static void insertion_sort(int [] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }
    }
}
