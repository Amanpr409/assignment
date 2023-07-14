package com.assignment;

public class PrimeNumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int count =0;
        if(a<2){
            System.out.println("Not prime");
        }
        for (int i=2; i<a; i++){
            if (a%i==0){
                count++;
            }
        }if(count>1){
            System.out.println("Not Prime");
        }else {
            System.out.println("Prime");
        }
    }
}
