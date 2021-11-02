package ru.skillbox;

public class Book {
    private final String nameBook;
    private final String author;
    private final int pageCount;
    private final int numberIsbn;

    public Book(String nameBook, String author, int pageCount, int numberIsbn) {
        this.nameBook = nameBook = "Porsche";
        this.author = author = "Sana";
        this.pageCount = pageCount = 255;
        this.numberIsbn = numberIsbn = 7785641;
    }

    public void add(String nameBook, int pageCount) {
        nameBook = nameBook + "\n" + author + pageCount + numberIsbn;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getNumberIsbn() {
        return numberIsbn;
    }

}
