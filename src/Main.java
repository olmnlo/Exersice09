import product.Book;

public class Main {
    public static void main(String[] args) {

        //Q1:
        //default
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



    }
}