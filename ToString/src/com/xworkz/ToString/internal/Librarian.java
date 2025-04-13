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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Librarian) {
                System.out.println("Reference of Librarian will be compared");
                Librarian librarian = this;
                Librarian librarian1 = (Librarian) obj;
                if (librarian.name.equals(librarian1.name) && librarian.library.equals(librarian1.library) ) {
                    System.out.println("Both librarians are same");
                    return true;
                }
            }
        }
        return false;
    }

}

