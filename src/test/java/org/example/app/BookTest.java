package org.example.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    void setUp() {
        book1 = new Book("Title 1", "Author 1");
        book2 = new Book("Title 1", "Author 1");
        book3 = new Book("Title 2", "Author 2");
    }

    @AfterEach
    void tearDown() {
        book1 = null;
        book2 = null;
        book3 = null;
    }

    @Test
    void testConstructor() {
        assertNotNull(book1, "Book should be created.");
        assertEquals("Title 1", book1.getTitle(), "Title should be 'Title 1'");
        assertEquals("Author 1", book1.getAuthor(), "Author should be 'Author 1'");
    }

    @Test
    void testGetters() {
        assertEquals("Title 1", book1.getTitle(), "Title getter should return correct value.");
        assertEquals("Author 1", book1.getAuthor(), "Author getter should return correct value.");
    }

    @Test
    void testSetters() {
        book1.setTitle("New Title");
        book1.setAuthor("New Author");
        assertEquals("New Title", book1.getTitle(), "Title setter should update the value.");
        assertEquals("New Author", book1.getAuthor(), "Author setter should update the value.");
    }

    @Test
    void testEqualsFail() {
        assertTrue(book1.equals(book3), "Books with different title and author should not be equal.");
    }

}