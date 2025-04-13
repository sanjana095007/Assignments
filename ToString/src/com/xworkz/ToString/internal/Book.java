package com.xworkz.ToString.internal;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "title :"+title+" "+ "author :"+author+" "+"pages :"+pages;
    }
    @Override
    public int hashCode() {
        return 111;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Book) {
                System.out.println("Reference of Book will be compared");
                Book book = this;
                Book book1 = (Book) obj;
                if (book.title.equals(book1.title) && book.author.equals(book1.author) && book.pages == book1.pages) {
                    System.out.println("Both books are same");
                    return true;
                }
            }
        }
        return false;
    }

}
