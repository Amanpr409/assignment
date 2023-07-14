package com.assignment;

public class SmallestElements {

        public static void main(String[] args) {
            int[] array = {5, 2, 9, 1, 7};

            int smallest = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                }
            }

            System.out.println("The smallest element in the array is: " + smallest);
        }


}
