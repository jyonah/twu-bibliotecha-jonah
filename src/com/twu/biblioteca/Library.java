package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookshelf;

    public Library(){}
    public Library(ArrayList<Book> books){
        this.bookshelf = books;
    }

    public String welcome() {
        return "Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore.";
    }

    public String booksToString(){
        String result = "";
        for (Book book: this.bookshelf) {
            result += book.title + " | " + book.author + " | " + book.year +"\n";
        }
        return result;
    }

    public String menuString(){
        return "0 List of Books";
    }
}

