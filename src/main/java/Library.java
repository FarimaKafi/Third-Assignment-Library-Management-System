import College.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    /*
    * The library should have a list of books.
    * The library should have a map of books ISBNs which is linked to the amount of book
    -> (for example: harry potter -> 4 means there are currently 4 harry potter books)
    * The library should have a list of users and a list of librarians.
     */
    private ArrayList<Book> books;
    private HashMap<Book, Integer> bookQuantities;
    private ArrayList<User> users;
    private ArrayList<Librarian> librarians;


    public Library() {
        this.books = new ArrayList<Book>();
        this.bookQuantities = new HashMap<Book, Integer>();
        this.users = new ArrayList<User>();
        this.librarians = new ArrayList<Librarian>();
    }

    //book related functions

    public void addBook(Book book, int quantity){
        //TODO
        books.add(book);
        bookQuantities.put(book, quantity);

    }

    public void removeBook(Book book, int quantity){
        //TODO
        books.remove(book);
        bookQuantities.remove(book);

    }

    public void searchBook(String searchTerm){
        //TODO
        for (Book book : books) {
            if (book.getName().contains(searchTerm) || book.getAuthor().contains(searchTerm)) {
                System.out.println(book);
            }
        }

    }

    public void updateBook(Book book, String newName, String newAuthor, int newYear){
        //TODO
        book.setName(newName);
        book.setAuthor(newAuthor);
        book.setYear(newYear);
    }

    public boolean doesBookExist(Book book){
        //TODO
        return books.contains(book);
    }

    public void increaseBook(Book book, int quantity){
        //TODO
        int currentQuantity = bookQuantities.get(book);
        bookQuantities.put(book, currentQuantity + quantity);
    }

    public void decreaseBook(Book book, int quantity){
        //TODO
        int currentQuantity = bookQuantities.get(book);
        if (currentQuantity >= quantity) {
            bookQuantities.put(book, currentQuantity - quantity);
        } else {
            System.out.println("Cannot decrease quantity below 0.");
        }
    }

    //user related functions

    public void addUser(User user){
        //TODO
        users.add(user);
    }

    public void removeUser(User user){
        //TODO
        users.remove(user);
    }

    public void searchUser(String searchTerm){
        //TODO
        for (User user : users) {
            if (user.getUsername().contains(searchTerm)) {
                System.out.println(user);
            }
        }
    }

    public void updateUser(User user, String newUsername, String newPassword){
        //TODO
        user.setUsername(newUsername);
        user.setPassword(newPassword);
    }

    public boolean doesUserExist(User user){
        //TODO
        return users.contains(user);
    }

    //librarian related functions

    public void addLibrarian(Librarian librarian){
        //TODO
        librarians.add(librarian);
    }

    public void removeLibrarian(Librarian librarian){
        //TODO
        librarians.remove(librarian);
    }

    public void searchLibrarian(String searchTerm){
        //TODO
        for (Librarian librarian : librarians) {
            if (librarian.getUsername().contains(searchTerm)) {
                System.out.println(librarian);
            }
        }
    }

    public void updateLibrarian(Librarian librarian, String newUsername, String newPassword){
        //TODO
        librarian.setUsername(newUsername);
        librarian.setPassword(newPassword);
    }

    public boolean doesLibrarianExist(Librarian librarian){
        //TODO
        return librarians.contains(librarian);
    }


}
