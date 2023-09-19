package com.company;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        // 1. 定义数组放6 个得分 创建 getscore方法
        int [] scoreArr = getScores();

        // 2. 求最大值 (最高分)
        int max = getMax(scoreArr);
        System.out.println("The max score is " + max);

        //3. 求最小值(最低分)
        int min = getMin(scoreArr);
        System.out.println("The min score is " + min );
        //4. 求总分
        int sum = getSum(scoreArr);
        System.out.println("The sum score is " + sum);
        //5. 总分 - 最大值 - 最小值
        // 此处注意不要写死 !!!
        int avg = (sum - min - max )/(scoreArr.length - 2);
        System.out.println("The play's real average score is " + avg);
    }

    // 4
    public  static int getSum(int [] arr){
       int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    //3 最小值
    public  static  int getMin(int [] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]< min ){
                min = arr[i];
            }
        }

        return  min;
    }

    //2 求最大值
    public  static  int getMax(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return  max;
    }
    // 1
    public static int[] getScores(){
        int [] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("Please enter the score  " + (i+ 1)+ ":");
            // 此处做出判断 分数区间
            int score = sc.nextInt();
            if (score >= 0 && score <= 100 ){
                scores [i] = score;
                i++; // 满足条件 再++ ;
            }else {
                System.out.println("The score is not right ! Now is the " + i + "th score.");
            }

        }
        System.out.println("Ok, all scores are ready.");
        return scores;

    }



}
