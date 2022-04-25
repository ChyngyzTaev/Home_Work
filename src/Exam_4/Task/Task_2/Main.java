package Exam_4.Task.Task_2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Order newOrder = new Order();
        newOrder.setNumber(1);
        newOrder.setCreateDate(LocalDate.now());
        newOrder.setCreateTime(LocalTime.now());

        Product newProduct = new Product();
        newProduct.setName("Молоко");
        newProduct.setType(ProductType.MILK);
        newProduct.setName("Фаст-Фуд");
        newProduct.setType(ProductType.MEAL);
        newProduct.setName("Чёрный хлеб");
        newProduct.setType(ProductType.BREAD);

        orders.add(newProduct);
        System.out.println(orders);
    }
}
