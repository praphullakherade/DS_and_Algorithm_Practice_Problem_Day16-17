package com.dsandalgorithm;

import java.util.Arrays;

public class AnagramDetection {
    public static void main(String[] args) {
        String str1 = "State";
        String str2 = "Taste";
        char[] array1=str1.toLowerCase().toCharArray();
        char[] array2=str2.toLowerCase().toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        if(Arrays.equals(array1, array2)) {
            System.out.println("string are anagrams");
        }else {
            System.out.println("string are not anagram");
        }
    }
}
