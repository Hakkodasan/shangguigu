package com.company;

public class ArrayMax {
    public static void main(String[] args) {
        int[] array = {12,78,33,77,89,2134,67};

       // printArray(array);
        System.out.println(getMax(array));
    }

//    public  static void printArray(int [] arr){
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            if(i == arr.length-1){
//                System.out.print(arr[i]);
//            }
//            else {
//                System.out.print(arr[i] + ",");
//            }
//        }
//        System.out.print("]");
//    }
    public static int getMax(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max =  arr[i];
            }
        }
        return max;
    }
}
