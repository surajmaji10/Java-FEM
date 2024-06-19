package com.akash.interfaces;

public class Book implements Product{

    private String name;
    private double price;
    private String author;
    private long isbn;

    public Book(){

    }

    public Book(String author, long isbn){
        setAuthor(author);
        setIsbn(isbn);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        //return Product.super.getPrice();
        return price;
    }

    @Override
    public void setPrice(double price) {
        //Product.super.setPrice();
        this.price = price;
    }
}
