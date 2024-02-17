package com.ibm;

import java.util.ArrayList;
import java.util.List;

class Book1 {
    private String title;
    private String author;
    
    public Book1 (String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Library1 {
    private List<Book1> books;

    public Library1() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book1 book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library has the following books:");
        for (Book1 book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

public class Has_A {
    public static void main(String[] args) {
       Library1 library = new Library1();

        library.addBook(new Book1("Java Programmin","James G"));
        
        library.displayBooks();
    }
}
