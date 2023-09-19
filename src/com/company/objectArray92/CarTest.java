package com.company.objectArray92;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // 1.创建数组存三个汽车对象
        Car[] arr = new Car[3];

        //2. 创建汽车对象, 数据来源键盘输入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            // 必须再循环内创建对象每次才能 有新的
            Car c = new Car();
            //录入信息
            // 品牌
            System.out.println("The brand !");
             String brand = sc.next();
             c.setBrand(brand);
            // 价格
            System.out.println("The Price !");
            int price = sc.nextInt();
            c.setPirce(price);
            // 颜色
            System.out.println("The Color !");
            String color = sc.next();
            c.setColor(color);

            // 对象生成后添加到索引
            arr[i] = c;
        }

        //3. 遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand()+ "," + car.getPirce() +","+ car.getColor());
        }
        
    }
}
