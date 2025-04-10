package com.xworkz.ToString.internal;

public class Librarian {
   private String name;
   private String library;
   private int booksManaged;

    public Librarian(String name, String library, int booksManaged) {
        this.name = name;
        this.library = library;
        this.booksManaged = booksManaged;
    }

    public String toString() {
        return "Librarian: " + name + ", Library: " + library + ", Books Managed: " + booksManaged;
    }
    @Override
    public int hashCode() {
        return 153;
    }
}

