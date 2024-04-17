package ru.gb.HW4.repository;

import org.springframework.stereotype.Repository;
import ru.gb.HW4.domen.Book;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book)
    {
        books.add(book);
    }

    public List<Book> getBooks()
    {
        return books;
    }

}
