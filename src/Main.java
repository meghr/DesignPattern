import prototyePattern.Book;
import prototyePattern.Movie;
import prototyePattern.Registry;

public class Main {

    public static void main(String[] args){


        // 1. Singleton Demo
        SingletonDemo instance1 = SingletonDemo.getInstance();

        SingletonDemo instance2 = SingletonDemo.getInstance();

        System.out.println("Object -> " + instance1);

        System.out.println("Object -> " + instance2);


        // 2. Builder Pattern

        BuilderPattern.Builder builder = new BuilderPattern.Builder();

        builder.bread("HoneyBread").condiments("Mustard").dressing("Stuffing").meat("Ham");

        BuilderPattern customerOrder = builder.build();

        System.out.println(customerOrder.getBread());
        System.out.println(customerOrder.getCondiments());
        System.out.println(customerOrder.getDressing());
        System.out.println(customerOrder.getMeat());


        // 3. Prototype Patter

        // we are created object with default parameters
        Registry registry = new Registry();

        // Now we clone the default object created in Registry
        Movie movie = (Movie) registry.createItems("Movie");

        // Now we are setting the movie object with required parameters

        movie.setTitle("Rush Hours 1");
        movie.setRuntime(160.0);

        // Now we clone the default object created in Registry

        Book book = (Book) registry.createItems("Book");

        // Now we are setting the movie object with required parameters

        book.setTitle("Alchemist");
        book.setNumberOfPages(180);

        // Not we have not set the url for both object hence it will be null only.


        System.out.println(movie.getTitle());
        System.out.println(movie.getRuntime());
        System.out.println(movie.getUrl());


        System.out.println(book.getTitle());
        System.out.println(book.getNumberOfPages());
        System.out.println(book.getUrl());



    }
}
