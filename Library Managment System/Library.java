

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryOperations {
    private List<Book> books;
    private List<User> users;

    public Library(){
        books = new ArrayList<>();
        users= new ArrayList<>();
    }
    @Override 
    public void addBook (Book book){
        books.add(book);
    }
    @Override
    public void removeBook(int bookID) {
        books.removeIf(book -> book.getBookinfo().contains("BookID: " + bookID));
    }
    @Override
    public Book searchBook(int bookID){
        for (Book book : books) {
            if (book.getBookinfo().contains("BookID: " + bookID)){
                return book;
            }
        }
        return null;
    }

    // public void borrowBook(Student student, int bookID) {
    //     Book book = searchBook(bookID);
    //     if (book != null && book.isAvailable()) {
    //         book.setAvailable(false);
    //         System.out.println(student.name + " borrowed " + book.getBookinfo());
    //     } else {
    //         System.out.println("Book is not available.");
    //     }
    // }

    public void returnBook(Student student, int bookID){
        Book book = searchBook(bookID);
        if (book != null){
            book.setAvailable(true);
            System.out.println(student.name + "returned" + book.getBookinfo()) ;
        }

    }
    
    public void viewAllBooks(){
        for (Book book : books){
            System.out.println(book.getBookinfo());
        }
    }
}



