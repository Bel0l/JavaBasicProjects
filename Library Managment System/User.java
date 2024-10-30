 public abstract class User {
    protected int userId;
    protected String name;
    protected String role;

    public User (int userId , String name , String role){
        this.userId = userId;
        this.name = name;
        this.role = role;
    }
    public abstract void accessLibrary ();
}