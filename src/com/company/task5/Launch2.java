package com.company.task5;

import java.util.Scanner;

public class Launch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи числа");
        int i = scanner.nextInt();
        int sum = 0;
        while (i != 0){
            sum += i % 10;
            i /= 10;
        }
        System.out.println(sum);
    }
}
