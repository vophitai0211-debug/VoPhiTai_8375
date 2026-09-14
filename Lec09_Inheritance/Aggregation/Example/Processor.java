package Lec09_Inheritance.Aggregation.Example;

public class Processor {

    public static void main(String[] args) {
        Author author = new Author("101", "Napoleon Hill");
        Book book = new Book("1", "Think And Grow Rich", author);
        System.out.println("Book information: " + book);
    }
}
