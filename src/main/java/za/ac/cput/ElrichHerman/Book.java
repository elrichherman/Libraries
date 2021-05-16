package za.ac.cput.ElrichHerman;

 /*
    Elrich Herman
    218150040
    Assignment 2 - ADP3
    16/05/2021
 */

import java.time.LocalDate;
import java.util.*;

public class Book {

        private int bookNr;
        private String bookName;
        private LocalDate dateCreated;
        private int bookAge;


    public Book(String bookName , int bookNr) {
        this.bookName = bookName;
        this.bookNr = bookNr;
    }

    public int getBookNr() {
        return bookNr;
    }

    public void setBookNr(int bookNr) {
        this.bookNr = bookNr;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getBookAge() {
        return bookAge;
    }

    public void setBookAge(int bookAge) {
        this.bookAge = bookAge;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookNr == book.bookNr && bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookNr, bookName);
    }


    @Override
    public String toString() {
        return "Book{" + "bookNr=" + bookNr + ", bookName='" + bookName + '\'' + ", dateCreated=" +
                dateCreated + ", bookAge=" + bookAge + '}';
    }
}
