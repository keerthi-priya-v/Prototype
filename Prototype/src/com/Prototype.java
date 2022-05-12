package com;

public class Prototype {
    public static void main(String args[]) throws CloneNotSupportedException{

        BookShop bookShop1 =  new BookShop();
        bookShop1.setBookShopName("Vivek Book Store");
        bookShop1.loadData();

        BookShop bookShop2 = bookShop1.clone();
        bookShop1.getBooks().remove(1);
        bookShop2.setBookShopName("Anand Book Store");

        System.out.println(bookShop1);

        System.out.println(bookShop2);


    }
}
