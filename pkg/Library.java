package library.management;

import java.util.ArrayList;

public class Library {
    private ArrayList<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
    }

    public void showBooks() {
        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library myLibrary = new Library();
        myLibrary.addBook("Effective Java");
        myLibrary.addBook("Clean Code");
        myLibrary.showBooks();
    }
}
