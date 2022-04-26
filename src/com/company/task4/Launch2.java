package com.company.task4;

import java.util.Scanner;

public class Launch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Не делится");
        }
    }
}
