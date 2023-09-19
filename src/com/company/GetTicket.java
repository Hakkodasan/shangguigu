package com.company;

import java.util.Scanner;

public class GetTicket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the original price : ");
        int ticket = sc.nextInt();
        System.out.println("Please enter the month : ");
        int month = sc.nextInt();
        System.out.println("Please enter the class of your choice, First Class 0 Economy Class 1 ");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10) {

            ticket = getTicket(ticket, seat, 0.7, 0.65);
        } else if (month <= 4 && month >= 1 || month >= 11 && month <= 12) {
            ticket = getTicket(ticket, seat, 0.8, 0.9);
        } else {
            System.out.println("Please enter the correct month !");
        }
        System.out.println(ticket);


    }

    private static int getTicket(int ticket, int seat, double dcot0, double dcot1) {
        if (seat == 0) {
            ticket = (int) (ticket * dcot0);
        } else if (seat == 1) {
            ticket = (int) (ticket * dcot1);
        } else {
            System.out.println("No this class !");
        }
        return ticket;
    }

//public static int getPrice(int ticket, int seat, double dcot0, double dcot1){


}
