package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 2;
            res += arr[i];
        }
        System.out.println("For: " + res);
        res = 0;
        int i = 0;
        while (i < arr.length){
            arr[i] = i + 5;
            res += arr[i];
            i++;
        }
        System.out.println("While: " + res);
        res = 0;
        i = 0;
        do{
            arr[i] = i + 9;
            res += arr[i];
            i++;
        }while (i < arr.length);
        System.out.println("Do-while: " + res);
    }
}
