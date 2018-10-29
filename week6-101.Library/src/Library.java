
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slinger
 */
public class Library {

    //with constructor public Library()s public void addBook(Book newBook) printBooks()
    private ArrayList<Book> library;
    

    public Library() {
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.library.add(new Book(newBook.title(), newBook.publisher(), newBook.year()));
    }

    public void printBooks() {
        for (Book book : this.library) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> containsTitle = new ArrayList<Book>();

        for (Book book : this.library) {
            if (StringUtils.included(book.title(), title)) {
                containsTitle.add(book);
            }
        }

        return containsTitle;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> containsPublisher = new ArrayList<Book>();

        for (Book book : this.library) {
            if (StringUtils.included(book.publisher(), publisher)) {
                containsPublisher.add(book);
            }
        }

        return containsPublisher;

    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> containsYear = new ArrayList<Book>();

        for (Book book : this.library) {
            if (book.year() == year) {
                containsYear.add(book);
            }
        }

        return containsYear;
    }



}
