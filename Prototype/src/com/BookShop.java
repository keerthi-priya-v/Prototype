package com;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String bookShopName;
    List<Book> books = new ArrayList<>();

    public String getBookShopName() {
        return bookShopName;
    }

    public void setBookShopName(String bookShopName) {
        this.bookShopName = bookShopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void loadData(){
        for(int i=1;i<=4;i++)
        {
            Book loadBook = new Book();
            loadBook.setBookId(i);
            loadBook.setBookName("Book"+i);
            getBooks().add(loadBook);
        }
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {

        BookShop bookShop = new BookShop();
        for(Book book: this.getBooks()){
            bookShop.getBooks().add(book);
        }
        return bookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "bookShopName='" + bookShopName + '\'' +
                ", books=" + books +
                '}';
    }
}
