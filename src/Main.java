import movable.MovablePoint;
import product.Book;
import product.Movie;
import product.Product;

import java.util.ArrayList;

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
            b1.setPrice(90); //no error
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

        b2.setAuthor("Faisal");
        b2.setName("C++");
        try {
            b2.setPrice(320); //no error
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

        movie1.setDirector("Omar");
        movie1.setName("Saw");
        try {
            movie1.setPrice(140); //no error
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

        movie2.setDirector("Leo");
        movie2.setName("IT");
        try {
            movie2.setPrice(900); //no error
//            movie2.setPrice(-30); // error
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        System.out.println("movie2 set price: "+ movie2.getPrice());
        System.out.println("movie2 set name: "+ movie2.getName());
        System.out.println("movie2 set director: "+ movie2.getDirector());
        System.out.println("movie2 set discount 25%: "+ movie2.getDiscount());

        System.out.println("Products information--------------------------------");

        ArrayList<Product> products = new ArrayList<>();
        products.add(b1);
        products.add(b2);
        products.add(movie1);
        products.add(movie2);
        System.out.println(products);

        //Q2
        System.out.println("Question 2");
        MovablePoint movable_point = new MovablePoint();
        System.out.println(movable_point);

        System.out.println("movable_point get x: "+ movable_point.getX());
        System.out.println("movable_point get y: "+ movable_point.getY());
        System.out.println("movable_point get x_speed: "+ movable_point.getX_speed());
        System.out.println("movable_point get Y_speed: "+ movable_point.getY_speed());

        movable_point.setX(10);
        movable_point.setY(-10);
        try {
//            movable_point.setX_speed(-10);
            movable_point.setX_speed(10);
            movable_point.setY_speed(30);
//            movable_point.setY_speed(-30);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("movable_point set x: "+ movable_point.getX());
        System.out.println("movable_point set y: "+ movable_point.getY());
        System.out.println("movable_point set x_speed: "+ movable_point.getX_speed());
        System.out.println("movable_point set Y_speed: "+ movable_point.getY_speed());


        System.out.println("Moving------------");
        movable_point.moveUp();
        System.out.println("movable_point moveUp x: "+ movable_point.getX());
        System.out.println("movable_point moveUp y: "+ movable_point.getY());
        System.out.println("movable_point moveUp x_speed: "+ movable_point.getX_speed());
        System.out.println("movable_point moveUp Y_speed: "+ movable_point.getY_speed());
        movable_point.moveDown();
        System.out.println("movable_point moveDown x: "+ movable_point.getX());
        System.out.println("movable_point moveDown y: "+ movable_point.getY());
        System.out.println("movable_point moveDown x_speed: "+ movable_point.getX_speed());
        System.out.println("movable_point moveDown Y_speed: "+ movable_point.getY_speed());
        movable_point.moveRight();
        System.out.println("movable_point moveRight x: "+ movable_point.getX());
        System.out.println("movable_point moveRight y: "+ movable_point.getY());
        System.out.println("movable_point moveRight x_speed: "+ movable_point.getX_speed());
        System.out.println("movable_point moveRight Y_speed: "+ movable_point.getY_speed());
        movable_point.moveLeft();
        System.out.println("movable_point moveLeft x: "+ movable_point.getX());
        System.out.println("movable_point moveLeft y: "+ movable_point.getY());
        System.out.println("movable_point moveLeft x_speed: "+ movable_point.getX_speed());
        System.out.println("movable_point moveLeft Y_speed: "+ movable_point.getY_speed());


        MovablePoint movable_point2 = new MovablePoint(88, 33, 30, 30);

        System.out.println(movable_point2);

        System.out.println("movable_point2 get x: "+ movable_point2.getX());
        System.out.println("movable_point2 get y: "+ movable_point2.getY());
        System.out.println("movable_point2 get x_speed: "+ movable_point2.getX_speed());
        System.out.println("movable_point2 get Y_speed: "+ movable_point2.getY_speed());

        movable_point2.setX(10);
        movable_point2.setY(-10);
        try {
//            movable_point2.setX_speed(-10);
            movable_point2.setX_speed(10);
            movable_point2.setY_speed(30);
//            movable_point2.setY_speed(-30);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("movable_point2 set x: "+ movable_point2.getX());
        System.out.println("movable_point2 set y: "+ movable_point2.getY());
        System.out.println("movable_point2 set x_speed: "+ movable_point2.getX_speed());
        System.out.println("movable_point2 set Y_speed: "+ movable_point2.getY_speed());


        System.out.println("Moving------------");
        movable_point2.moveUp();
        System.out.println("movable_point2 moveUp x: "+ movable_point2.getX());
        System.out.println("movable_point2 moveUp y: "+ movable_point2.getY());
        System.out.println("movable_point2 moveUp x_speed: "+ movable_point2.getX_speed());
        System.out.println("movable_point2 moveUp Y_speed: "+ movable_point2.getY_speed());
        movable_point2.moveDown();
        System.out.println("movable_point2 moveDown x: "+ movable_point2.getX());
        System.out.println("movable_point2 moveDown y: "+ movable_point2.getY());
        System.out.println("movable_point2 moveDown x_speed: "+ movable_point2.getX_speed());
        System.out.println("movable_point2 moveDown Y_speed: "+ movable_point2.getY_speed());
        movable_point2.moveRight();
        System.out.println("movable_point2 moveRight x: "+ movable_point2.getX());
        System.out.println("movable_point2 moveRight y: "+ movable_point2.getY());
        System.out.println("movable_point2 moveRight x_speed: "+ movable_point2.getX_speed());
        System.out.println("movable_point2 moveRight Y_speed: "+ movable_point2.getY_speed());
        movable_point2.moveLeft();
        System.out.println("movable_point2 moveLeft x: "+ movable_point2.getX());
        System.out.println("movable_point2 moveLeft y: "+ movable_point2.getY());
        System.out.println("movable_point2 moveLeft x_speed: "+ movable_point2.getX_speed());
        System.out.println("movable_point2 moveLeft Y_speed: "+ movable_point2.getY_speed());










    }
}