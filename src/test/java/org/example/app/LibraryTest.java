package org.example.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

    @BeforeEach
    void setUp() {
        library = new Library();
        book1 = new Book("Title 1", "Author 1");
        book2 = new Book("Title 2", "Author 2");
    }

    @AfterEach
    void tearDown() {
        library = null;
    }

    @Test
    void testGetBookCount() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getBookCount(), "Library should have 2 books.");
    }

    @Test
    void testAddNullBook() {
        library.addBook(null);
        assertEquals(0, library.getBookCount(), "Library should not accept null books.");
    }
}