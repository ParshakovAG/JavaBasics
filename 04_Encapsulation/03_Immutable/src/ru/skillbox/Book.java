package ru.skillbox;

public class Book {
    private final String nameBook;
    private final String author;
    private final int pageCount;
    private final int numberIsbn;

    public Book(String nameBook, String author, int pageCount, int numberIsbn) {
        this.nameBook = nameBook;
        this.author = author = "Sana";
        this.pageCount = pageCount;
        this.numberIsbn = numberIsbn = 1010111;
    }

    public void add(String nameBook, int page) {
        nameBook = nameBook + "\n" + page + author + numberIsbn;
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

    public void print(String nameBook, int pageCount) {
        System.out.println(nameBook + "\n" + pageCount + " - " + "стр." +
                "\n" + "Автор" + " - " + author + "\n" + "Номер ISBN" + " - " + numberIsbn);
    }

}
