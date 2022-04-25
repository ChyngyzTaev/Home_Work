package Exam_4.Task.Task_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");

        String numbers = sc.next();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == ','){
                continue;
            }
            set.add(numbers.charAt(i));
        }
        System.out.println(set);
    }
}
