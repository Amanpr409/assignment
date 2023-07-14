package com.assignment;

public class Fabonacci {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9 };
        int result = 0;
        for (int i = 0; i<arr1.length; i++){
            result = result + arr1[1];
            System.out.println(result);
        }
    }
}
