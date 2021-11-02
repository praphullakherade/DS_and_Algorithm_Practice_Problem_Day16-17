package com.dsandalgorithm;

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        System.out.print("Enter first number : ");
        Scanner sc = new Scanner(System.in);
        String string= sc.next();

        int num = string.length();
        PermutationOfString permutation = new PermutationOfString();
        permutation.permute(string, 0, num - 1);
    }

    public static void permute(String string, int l, int r) {
        if (l == r)
            System.out.println(string);
        else {
            for (int i = l; i <= r; i++) {
                string = swap(string, l, i);
                permute(string, l + 1, r);
                string = swap(string, l, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
