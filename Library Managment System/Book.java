public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book (int bookId, String title , String author  ){
        this.bookId= bookId;
        this.title= title;
        this.author= author;
        this.isAvailable= true;

    }
    void setAvailable (boolean available){
        this.isAvailable= available;
    }

    public String getBookinfo (){
        return " bookId: " + bookId + " title: " + title + " author: " + author ;
    }
}
