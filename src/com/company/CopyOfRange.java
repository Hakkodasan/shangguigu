package com.company;

public class CopyOfRange {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int [] copyArr = copyOfRancge(arr, 4,6);

        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }

    public  static int [] copyOfRancge(int [] arr, int from, int to){
        int [] newArr = new int [to - from + 1];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr [index] = arr[i];
            index++;
        }
        return newArr;
    }
}
