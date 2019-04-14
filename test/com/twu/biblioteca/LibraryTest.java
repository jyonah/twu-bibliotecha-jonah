package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void welcome_shouldWelcome() {
//        Arrange
//        Act
        Library lib = new Library();
        String result = lib.welcome();
//        Assert
        assertEquals("Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore.", result);
    }

    @Test
    public void listBooks_shouldListBooks(){
//        Arrange
        ArrayList<String> books = new ArrayList<String>();
        books.add("James and the giant peach");
        books.add("Matilda");
        books.add("A little princess");
        Library lib = new Library(books);
//        Act
        String result = lib.booksToString();
//        Assert
        assertEquals("James and the giant peach\nMatilda\nA little princess\n", result);
    }

    @Test
    public void listBooks_shouldIncludeAuthorAndDate(){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("James and the Giant Peach", "Roald Dahl", "1961"));
        books.add(new Book("Matilda", "Roald Dahl", "1988"));
        Library lib = new Library(books);

        String result = lib.booksToString();
        String expected = "James and the Giant Peach    Roald Dahl  1961\n Matilda  Roald Dahl  1988\n";

        assertEquals(expected, result);
    }
}
