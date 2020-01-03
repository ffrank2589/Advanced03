package com.example.lib;

import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" net income:(w)");
        double net_income = scanner.nextDouble();
        double bonus = 0;
        if (net_income <= 10) {
            bonus = 0.1 * net_income;
        } else if (net_income <= 20) {
            net_income -= 10;
            bonus = 1 + net_income * 0.075;
        } else if (net_income <= 40) {
            net_income -= 20;
            bonus = (Double) 2.5 + net_income * 0.05;//1+1.5
        } else if (net_income <= 60) {
            net_income -= 40;
            bonus = (Double) 3.5 + net_income * 0.03;//1+1.5+1
        } else if (net_income <= 100) {
            net_income -= 60;
            bonus = (Double) 4.1 + net_income * 0.015;//1+1.5+1+0.6
        } else if (net_income > 100) {
            net_income -= 100;
            bonus = (Double) 4.7 + net_income * (Double) 0.015;//1+1.5+1+0.6+0.6
        }
        System.out.println("bonus:" + bonus + "w");
    }
}