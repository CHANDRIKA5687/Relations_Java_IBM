package com.ibm;

class Book {
    protected String title;
    protected String author;
    
    public Book(String title, String author) {
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

class Library extends Book {
    private int pageCount;

    public Library(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}

public class Is_A {
    public static void main(String[] args) {

    	Library book1 = new Library("XYZ", "cd", 180);

        
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Page Count: " + book1.getPageCount());

       
    }
}
