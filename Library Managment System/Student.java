// public class Student extends User {

//     public Student(int userID, String name) {
//         super(userID, name, "Student");
//     }

//     @Override
//     public void accessLibrary() {
//         System.out.println("Student can borrow and return books.");
//     }

//     public void borrowBook(int bookID, Library library) {
//         library.borrowBook(this, bookID);
//     }

//     public void returnBook(int bookID, Library library) {
//         library.returnBook(this, bookID);
//     }
// }


public class Student extends User {

    public Student (int userId, String name){
        super (userId, name, "Student");
    }

    @Override
    public void accessLibrary(){
        System.out.println("Student can borrow & return books");
    }
    public void borrowBook(int bookID, Library library){
        library.borrowBook(this, bookID);
    }
    public void returnBook(int bookID, Library library){
        library.returnBook(this, bookID);
    }
}