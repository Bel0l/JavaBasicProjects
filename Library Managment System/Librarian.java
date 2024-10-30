public class Librarian extends User {

    public Librarian (int userId, String name){
        super(userId, name, "Librarian");
    }

    public void accessLibrary (){
        System.out.println("Librarian can manage library");
    }

    public void addBook ( Book book , Library library){
        library.addBook(book);
        System.out.println("book added to library");
    }

    public void removeBook (int bookId , Library library){
        library.removeBook(bookId);
        System.out.println("book removed");
    }
}
