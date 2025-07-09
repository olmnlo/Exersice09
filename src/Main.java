import product.Book;
import product.Movie;

public class Main {
    public static void main(String[] args) {

        //Q1:
        //default
        System.out.println("Question 1");
        Book b1 = new Book();
        System.out.println("b1 price: "+ b1.getPrice());
        System.out.println("b1 name: "+ b1.getName());
        System.out.println("b1 author: "+ b1.getAuthor());
        System.out.println("b1 discount 25%: "+ b1.getDiscount());

        b1.setAuthor("Hussam");
        b1.setName("Java");
        try {
            b1.setPrice(30); //no error
//            b1.setPrice(-30); // error
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }

        System.out.println("b1 set price: "+ b1.getPrice());
        System.out.println("b1 set name: "+ b1.getName());
        System.out.println("b1 set author: "+ b1.getAuthor());
        System.out.println("b1 set discount 25%: "+ b1.getDiscount());

        // super book
        System.out.println("Book 2");
        Book b2 = new Book("OOP", 230, "Ahmed");
        System.out.println("b2 price: "+ b2.getPrice());
        System.out.println("b2 name: "+ b2.getName());
        System.out.println("b2 author: "+ b2.getAuthor());
        System.out.println("b2 discount 25%: "+ b2.getDiscount());

        b2.setAuthor("Hussam");
        b2.setName("Java");
        try {
            b2.setPrice(30); //no error
//            b2.setPrice(-30); // error
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        System.out.println("b2 set price: "+ b2.getPrice());
        System.out.println("b2 set name: "+ b2.getName());
        System.out.println("b2 set author: "+ b2.getAuthor());
        System.out.println("b2 set discount 25%: "+ b2.getDiscount());


        //default
        System.out.println("Movie 1");
        Movie movie1 = new Movie();
        System.out.println("movie1 price: "+ movie1.getPrice());
        System.out.println("movie1 name: "+ movie1.getName());
        System.out.println("movie1 director: "+ movie1.getDirector());
        System.out.println("movie1 discount 10%: "+ movie1.getDiscount());

        movie1.setDirector("Hussam");
        movie1.setName("Java");
        try {
            movie1.setPrice(30); //no error
//            movie1.setPrice(-30); // error
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }

        System.out.println("movie1 set price: "+ movie1.getPrice());
        System.out.println("movie1 set name: "+ movie1.getName());
        System.out.println("movie1 set director: "+ movie1.getDirector());
        System.out.println("movie1 set discount 10%: "+ movie1.getDiscount());

        // super movie
        System.out.println("Movie 2");
        Movie movie2 = new Movie("Interstellar", 280);
        System.out.println("movie2 price: "+ movie2.getPrice());
        System.out.println("movie2 name: "+ movie2.getName());
        System.out.println("movie2 director: "+ movie2.getDirector());
        System.out.println("movie2 discount 10%: "+ movie2.getDiscount());

        movie2.setDirector("Hussam");
        movie2.setName("Java");
        try {
            movie2.setPrice(30); //no error
//            movie2.setPrice(-30); // error
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        System.out.println("movie2 set price: "+ movie2.getPrice());
        System.out.println("movie2 set name: "+ movie2.getName());
        System.out.println("movie2 set director: "+ movie2.getDirector());
        System.out.println("movie2 set discount 25%: "+ movie2.getDiscount());

        //Q2
        System.out.println("Question 2--------------------------------");




    }
}