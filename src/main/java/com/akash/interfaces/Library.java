package com.akash.interfaces;

public class Library {
    public static void main(String[] args) {

        Product book = new Book();

        book.setPrice(101.234);
        System.out.println(book.getPrice());
        book.setName("Java FEM");
        System.out.println(book.getName());

        System.out.println(Product.mfgDate());

        Book newBook = new Book("Akash", 1234);

        newBook.setPrice(101.234);
        System.out.println(newBook.getPrice());
        newBook.setName("Java FEM");
        System.out.println(newBook.getName());

        System.out.println(newBook.getAuthor());
        System.out.println(newBook.getIsbn());


    }
}
