package com.dsandalgorithm;

public class BubbleSort {

    void bubbleSort(int arr[]) {
        int num = arr.length;
        for (int i = 0; i < num - 1; i++)
            for (int j = 0; j < num - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    void printArray(int arr[]) {
        int num = arr.length;
        for (int i = 0; i < num; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        BubbleSort sort = new BubbleSort();
        System.out.println("Before Sort : ");
        int array[] = { 64, 30, 25, 50, 22, 11, 90 };
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
        sort.bubbleSort(array);
        System.out.println(" ");
        System.out.println("After Sort : ");
        sort.printArray(array);
    }
}
