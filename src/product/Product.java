package product;

public abstract class Product {
    private String name;
    private double price;


    public Product(){

    }

    public Product(String name, double price){
        this.name = name;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws RuntimeException{
        if(price < 0){
            throw new RuntimeException("you can not enter negative number");
        }
        this.price = price;
    }

    public abstract double getDiscount();

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
