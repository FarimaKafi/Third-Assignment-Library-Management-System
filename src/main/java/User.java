import College.Book;

import java.util.ArrayList;
import java.util.List;

public class User {
    //User should have a list of books
    //User should have a username and a password
    private String username;
    private String password;
    private static List<String> rentedBooks;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.rentedBooks = new ArrayList<String>();
    }


    public static void rentBook(String book, String username, String password) {
        //TODO
        rentedBooks.add(book);
        System.out.println("Book rented successfully!");
    }

    public static void returnBook(String bookNameToReturn, String usernameToReturn, String passwordToReturn) {
    }

    public void returnBook(Book book) {
        //TODO
        if (rentedBooks.contains(book)) {
            rentedBooks.remove(book);
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book is not rented by this user!");
        }

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getRentedBooks() {
        return rentedBooks;
    }

    public void setUsername(String newUsername) {
    }

    public void setPassword(String newPassword) {
    }
}
