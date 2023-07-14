package com.assignment;


 public class EvenNumber {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                count++;
     //           sum += i;
                sum= sum+i;
            }
        }
        System.out.println("Count of even numbers : " + count);
        System.out.println("Sum of even numbers : " + sum);
    }
}
