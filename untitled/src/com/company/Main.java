package com.company;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //task1-6 below
        //task1();
        //task 1 = shows name
        //task2 a=int, b=int;
        //task3 a,b,c max;
        //task4 a=odd or even;
        //task5 empty state
        //task6 empty state

        /*int arr[] = new int [3];
        arr[0] = 14;
        arr[1] = 88;
        arr[2] = 1488;
        task7(arr);*/
        //for task 7 only
    }

    public static void task1() {
        String name = "John";
        String admin = name;
        System.out.println(admin);
    }

    public static void task2(int a, int b) {
        System.out.println(a - b);
    }

    public static void task3 (int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        }
        else if (b > a && b > c) {
            System.out.println(b);
        }
        else if (c > a && c > b) {
            System.out.println(c);
        }
    }

    public static void task4(int a) {
        if (a % 2 == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }

    public static void task5() {
        int arr[] = new int [5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;
        for (int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
    }

    public static void task6() {
        int arr[] = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] * 7);
        }
    }
    public static void task7(int arr[]) {
        int array_sum = 0;
        int i = 0;
        while(i < arr.length) {
            array_sum = array_sum + arr[i];
            i++;
        }
        System.out.println(array_sum);
    }
}

