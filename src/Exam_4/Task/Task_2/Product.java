package Exam_4.Task.Task_2;

public class Product extends Order {
    private String name;
    private ProductType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type){
        this.type = type;
    }
}
