package com.company;

import java.util.Random;

public class RandomLottery {
    public static void main(String[] args) {

        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        // 遍历新的奖池数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
