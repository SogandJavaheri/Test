package com.github.sogandjavaheri.Test.Bookshop;

public class BookshopTest {

    public static void main(String[] args) {

        Bookshop book1 = new Bookshop();

        book1.name = "Hamlet";
        book1.author = "Shakespeare";
        book1.publishYear = 1623;

        System.out.println(book1.name);
        System.out.println(book1.author);
        System.out.println(book1.publishYear);
    }
}
