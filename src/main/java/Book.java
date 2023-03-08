package College;

import java.util.Scanner;
public class Book {
    //Book should contain name,author,year of publish and ISBN

        // Class data members
        public int sNo;
        public String bookName;
        public String authorName;
        public int bookQty;
        public int bookQtyCopy;
        public int yearOfPublish;

        // Creating object of Scanner class to
        // read input from users
        Scanner input = new Scanner(System.in);

        // Method
        // To add book details
        public Book()
        {
            // Display message for taking input later
            // taking input via
            // nextInt() and nextLine() standard methods
            System.out.println("Enter Serial No of Book:");
            this.sNo = input.nextInt();
            input.nextLine();

            System.out.println("Enter Book Name:");
            this.bookName = input.nextLine();

            System.out.println("Enter Author Name:");
            this.authorName = input.nextLine();

            System.out.println("Enter Quantity of Books:");
            this.bookQty = input.nextInt();
            bookQtyCopy = this.bookQty;

            System.out.println("Enter year of publish of Book:");
            this.yearOfPublish = input.nextInt();
        }
}


