package com.company;

import java.util.Random;

public class RandomVerificationCode {
    public static void main(String[] args) {
        
        

    /*
    随机生成五位验证码 前4为大小写, 最后为数字

    方法:
    随机抽取, 放入数组,抽取索引
     */

    // 1. 大小写放入数组
    char [] chs = new char [52];
        for (int i = 0; i < chs.length; i++) {
            // ASCII  码表  97 就是 a\
            if (i <= 25){
                chs [i] = (char) (97 + i); // 添加小写字母
            }else { // 26 开始
                // 添加大写字幕  A = 65
                chs [i] = (char) (65 + i-26);

            }


        }
        //遍历一下
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] +  " ");
        }
        System.out.println("");

    //2.抽取四次
        Random r = new Random();
        //r.nextInt(chs.length);
        //int randomIndex = r.nextInt(chs.length);

        String fourChar = "";
    // 把元素装入随机索引
        for (int i = 0; i < 4; i++) {

            int randomIndex = r.nextInt(chs.length);
           // System.out.print(chs[randomIndex]);
            // 此时要用字符串把char 放进去
            fourChar = fourChar + chs[randomIndex];

        }

        System.out.println(fourChar);

    //4.抽取数字0-9  random 已经创建不用再建
        int number = r.nextInt(10);

        String vCode = fourChar + number;

        System.out.println("The Random Verification Code is " + vCode);


    }
}
