package product;

public class Movie extends Product{
    private String director;
    public Movie() {
        super("movie", 0);
        director = "director";

    }

    public Movie(String name, double price) {
        super(name, price);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return getPrice()-(getPrice()*0.25);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                super.toString()+
                '}';
    }
}
