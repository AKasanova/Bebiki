package org.example.Book;

public class Book implements Displayable {
   private String bookName;
   private String bookAuthor;
   private int bookYear;

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public void setBookName (String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public int getBookYear() {
        return bookYear;
    }

    @Override
    public void display() {

        System.out.println("Task 1");
       System.out.println("Author: " + this.bookAuthor);
       System.out.println("Book name: " + this.bookName);
       System.out.println("Book year: " + this.bookYear);

    }
}
