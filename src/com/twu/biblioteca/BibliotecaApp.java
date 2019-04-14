package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("James and the Giant Peach", "Roald Dahl", "1961"));
        books.add(new Book("Matilda", "Roald Dahl", "1988"));
        Library lib = new Library(books);
        System.out.println(lib.welcome());
        System.out.println("");
        System.out.println(lib.booksToString());

    }


}
