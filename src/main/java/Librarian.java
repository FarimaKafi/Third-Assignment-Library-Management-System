import College.Book;
import java.util.ArrayList;
public class Librarian {
    /*
    * The librarian should have a username and a password
    * The librarian should be able to search users, librarians and books
    * The librarian should be able to add\remove\\update user add\remove\\update_
    _ librarian and add\remove\\update book
     */

    private String username;
    private String password;
    private ArrayList<User> users;
    private ArrayList<Librarian> librarians;
    private Library library;

    public Librarian(String username, String password) {
        this.username = username;
        this.password = password;
        this.users = new ArrayList<User>();
        this.librarians = new ArrayList<Librarian>();
        this.library = library;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void searchUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println(user.getUsername() + " found.");
                return;
            }
        }
        System.out.println(username + " not found.");
    }

    public void updateUser(User user, String newPassword) {
        user.setPassword(newPassword);
    }

    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }

    public void removeLibrarian(Librarian librarian) {
        librarians.remove(librarian);
    }

    public void searchLibrarian(String username) {
        for (Librarian librarian : librarians) {
            if (librarian.getUsername().equals(username)) {
                System.out.println(librarian.getUsername() + " found.");
                return;
            }
        }
        System.out.println(username + " not found.");
    }

    public void updateLibrarian(Librarian librarian, String newPassword) {
        librarian.setPassword(newPassword);
    }

    public void addBook(Book book, int quantity) {
        library.addBook(book, quantity);
    }

    public void removeBook(Book book, int quantity) {
        library.removeBook(book, quantity);
    }

    public void searchBook(String name) {
        library.searchBook(name);
    }

    public void updateBook(Book book, String newName, String newAuthor, int newYear) {
        library.updateBook(book, newName, newAuthor, newYear);
    }

    public void doesBookExist(Book book) {
        library.doesBookExist(book);
    }

    public void increaseBook(Book book, int quantity) {
        library.increaseBook(book, quantity);
    }

    public void decreaseBook(Book book, int quantity) {
        library.decreaseBook(book, quantity);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public void setUsername(String newUsername) {
    }

    public void setPassword(String newPassword) {
    }
}
