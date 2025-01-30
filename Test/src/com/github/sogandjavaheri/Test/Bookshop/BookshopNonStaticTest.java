package com.github.sogandjavaheri.Test.Bookshop;

public class BookshopNonStaticTest {

    public static void main(String[] args) {

        BookshopNonStatic book1 = new BookshopNonStatic();

        book1.name = "Her Eyes";
        book1.author = "Bozorg Alavi";
        book1.publishYear = 9876;

        System.out.println(book1.name);
        System.out.println(book1.author);
        System.out.println(book1.publishYear);

        book1.sellAmount();
        book1.buyAmount();
    }
}
     class BookshopNonStatic{

        String name;
        String author;
        int publishYear;


        public void sellAmount(BookshopNonStatic this) {

            System.out.println("Sell amount of\t" + this.name + "\tis: " + this );

        }

        public void buyAmount(BookshopNonStatic this) {

            System.out.println("Buy amount of\t" + this.name + "\tis: " + this);

        }
    }