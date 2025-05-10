package calculator;

public abstract class Product {

    private String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}
