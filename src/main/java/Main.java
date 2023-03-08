import java.util.Scanner;

public class Main {
    /*
    * make a functional library app using oop
    * run the main program in Main.java and code the oop part in other classes
    * don't forget to add at least 1 librarian to the library to make it functionable.
    * *  *** don't limit yourself to our template ***
     */
    public static void main(String[] args) {
        Library library = new Library();
        // Add at least one librarian to the library
        library.addLibrarian(new Librarian("admin", "password"));

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Library Management System!");
            System.out.println("What would you like to do?");
            System.out.println("1. Search books");
            System.out.println("2. Rent a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the book name or author:");
                    String searchQuery = scanner.nextLine();
                    library.searchBook(searchQuery);
                    break;
                case 2:
                    System.out.println("Enter the book name:");
                    String bookName = scanner.nextLine();
                    System.out.println("Enter your username:");
                    String username = scanner.nextLine();
                    System.out.println("Enter your password:");
                    String password = scanner.nextLine();
                    User.rentBook(bookName, username, password);
                    break;
                case 3:
                    System.out.println("Enter the book name:");
                    String bookNameToReturn = scanner.nextLine();
                    System.out.println("Enter your username:");
                    String usernameToReturn = scanner.nextLine();
                    System.out.println("Enter your password:");
                    String passwordToReturn = scanner.nextLine();
                    User.returnBook(bookNameToReturn, usernameToReturn, passwordToReturn);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

    }

    public static void runMenu(){
        //TODO:
    }
}
