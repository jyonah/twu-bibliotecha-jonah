package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<String> bookshelf;

    public Library(ArrayList<String> books) {
        this.bookshelf = books;
    }

    public Library(){}

    public String welcome() {
        return "Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore.";
    }

    public String booksToString(){
        String result = "";
        for (String book: this.bookshelf) {
            result += book + "\n";
        }
        return result;
    }


}

