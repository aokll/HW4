package ru.gb.HW4.domen;

import lombok.Data;

@Data
public class Book {
    private String name;//название книги
    private double price;//цена книги
    private int numberOfBooksAvailable;//количество книг в наличии
}
