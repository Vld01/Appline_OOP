package Sweets;

import java.lang.reflect.GenericArrayType;

public abstract class Sweet {
    private String name;
    private int weight;
    private int price;
    private int id;

    public Sweet(){
        setId(GeneratorId.START_SEQ++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "имя='" + name + '\'' +
                ", вес=" + weight +
                ", цена=" + price +
                ", уникальный номер=" + id +
                '}';
    }
}
