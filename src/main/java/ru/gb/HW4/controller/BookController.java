package ru.gb.HW4.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.HW4.domen.Book;
import ru.gb.HW4.repository.BookRepository;
@Controller
@AllArgsConstructor
public class BookController {
    /*Мы не:
     * 1) создавали конструктор
     * 2) прописывали @Autovared  над полем productRepositry
     * потомучто мы прописали @AllArgsConstructor, согласно этой аннотации, Lombok сам создает
     * конструктор, и потом сам Spring в этот конструктор вставит реализацию всех полей
     * которые мы обьявили ниже.*/

    private final BookRepository bookRepository;

    @GetMapping("/books")//получаем список продуктов
    public String getProduct(Model model)
    {
        model.addAttribute("books",bookRepository.getBooks());
        return "books";
    }

    @PostMapping("/books")//добавляем список продуктов
    public String addProduct(Book book, Model model)
    {
        bookRepository.addBook(book);
        model.addAttribute("books",bookRepository.getBooks());
        return "books";
    }

}