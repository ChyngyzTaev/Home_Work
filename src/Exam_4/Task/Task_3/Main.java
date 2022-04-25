package Exam_4.Task.Task_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Pet, String> animals = new HashMap<>();
        animals.put(Pet.CAT, "Belok");
        animals.put(Pet.DOG, "Thomas Shelby");
        animals.put(Pet.PARROT, "Kesha");

        System.out.println(animals.entrySet());
    }
}
