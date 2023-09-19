package com.company;

/*
商城四个季度的收入按月汇总,求每个季度和全年收入
 */
public class TwoDArray {
    public static void main(String[] args) {

        // 1 创建二维数组储存数据
        int[][] yearArrArr = {
                {22, 66, 44},
                {56, 61, 12},
                {22, 66, 45},
                {48, 46, 14}

        };

        // 3. 全年营业额 yearSum 是quarter 的 和
        int yearSum = 0;
        // 2. 遍历二维数组得到每个一维数组求和
        for (int i = 0; i < yearArrArr.length; i++) {
            // i 二维数组每一个索引
            // yearArrArr[i] 元素
            int [] quarterArr = yearArrArr[i];
            int sum = getSum(quarterArr);
            System.out.println("The " + (i +1) + " th quarter sum is " + sum);
            yearSum = yearSum + sum; // 循环一次加一次
        }
        System.out.println("The annual income is " + yearSum );

    }


    // 创建一个遍历数组的方法
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

}
