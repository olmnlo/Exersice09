package product;

public class Book extends Product{
    private String author;

    public Book(){
        super("book", 0);
        author = "author";
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        return getPrice()-(getPrice()*0.10);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                super.toString()+
                '}';
    }
}
