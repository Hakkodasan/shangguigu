package com.company;

public class ElemInArray {
    public static void main(String[] args) {
        int[] arr = {3, 6, 6, 7, 55, 88, 89};

        boolean flag = contains(arr, 78);
        System.out.println(flag);
    }

    public static  boolean contains(int [] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }


}
