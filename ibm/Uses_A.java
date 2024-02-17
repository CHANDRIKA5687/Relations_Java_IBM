package com.ibm;

import java.util.ArrayList;
import java.util.List;

class Book2 {
    private String title;
    private String author;
    
    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters and setters
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

class Library2 {
    private List<Book2> books;

    public Library2() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book2 book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books available in the library:");
        for (Book2 book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

class LibraryMember {
    private String name;
    private Library2 library;

    public LibraryMember(String name, Library2 library) {
        this.name = name;
        this.library = library;
    }

    public String getName() {
        return name;
    }

    public void displayAvailableBooks() {
        library.displayBooks();
    }
}

public class Uses_A {
    public static void main(String[] args) {

        Library2 library = new Library2();

        library.addBook(new Book2("1984", "George Orwell"));

        LibraryMember member = new LibraryMember("Alice", library);

        System.out.println("Books available for " + member.getName() + ":");
        member.displayAvailableBooks();
    }
}