package com.company.task4;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 180;

        if (a + b + c == count){
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }
    }
}
