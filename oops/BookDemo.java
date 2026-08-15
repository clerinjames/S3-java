package oops;

class Book {
    String title, author;
    double price;
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void display() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
    }
}
public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Unknown1", "Not Assigned", 0);
        Book b2 = new Book("Unknown2", "Not Assigned", 0);
        System.out.println("Book 1");
        b1.display();
        System.out.println("Book 2");
        b2.display();
    }
}
